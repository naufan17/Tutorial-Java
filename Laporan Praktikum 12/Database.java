package com.naufan.parktikum12;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class Database {
    private static final String ROW_ID = "id";
    private static final String ROW_NAMA = "nama";
    private static final String ROW_SEKOLAH = "sekolah";
    private static final String NAMA_DB = "INIDB";
    private static final String NAMA_TABEL = "percobaan";
    private static final int DB_VERSION = 1;
    private static final String CREATE_TABLE = "create table " + NAMA_TABEL + " (" + ROW_ID + " integer PRIMARY KEY autoincrement, " + ROW_NAMA + " text, " + ROW_SEKOLAH + " text)";
    private final Context context;
    private DatabaseOpenHelper dbhelper;
    private SQLiteDatabase db;

    public Database(Context ctx) {
        this.context = ctx;
        dbhelper = new DatabaseOpenHelper(context);
        db = dbhelper.getWritableDatabase();
    }

    private static class DatabaseOpenHelper extends SQLiteOpenHelper {
        public DatabaseOpenHelper(Context context) { super(context, NAMA_DB, null, DB_VERSION); }

        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREATE_TABLE);
        }

        public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {
            db.execSQL("DROP TABLE IF EXISTS " + NAMA_DB);
            onCreate(db);
        }
    }

    public void close() {
        dbhelper.close();
    }

    public void addRow (String nama, String sekolah) {
        ContentValues values = new ContentValues();
        values.put(ROW_NAMA, nama);
        values.put(ROW_SEKOLAH, sekolah);
        try {
            db.delete (NAMA_TABEL, null, null);
            db.insert(NAMA_TABEL, null, values); }
        catch (Exception e) {
            Log.e("DB ERROR", e.toString());
            e.printStackTrace();
        }
    }

    public ArrayList<ArrayList<Object>> ambilSemuaBaris() {
        ArrayList<ArrayList<Object>> dataArray = new ArrayList<ArrayList<Object>>();
        Cursor cur;
        try {
            cur = db.query(NAMA_TABEL, new String[] { ROW_ID, ROW_NAMA, ROW_SEKOLAH }, null, null, null, null, null);
            cur.moveToFirst();
            if (!cur.isAfterLast()) {
                do {
                    ArrayList<Object> datalist = new ArrayList<Object>();
                    datalist.add(cur.getLong(0));
                    datalist.add(cur.getString(1));
                    datalist.add(cur.getString(2));
                    dataArray.add(datalist);
                } while (cur.moveToNext());
            }
        } catch (Exception e){
            e.printStackTrace();
            Log.e("DEBE ERROR", e.toString());
        }
        return dataArray;
    }
}