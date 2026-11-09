package com.naufan.parktikum12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Database dm;
    Button btambah;
    TableLayout tabel4data;
    private EditText inama, isekolah;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dm = new Database(this);
        tabel4data = (TableLayout) findViewById(R.id.tabel_data);
        inama = (EditText) findViewById(R.id.inama);
        isekolah = (EditText) findViewById(R.id.isekolah);
        btambah = (Button) findViewById(R.id.btambah);
        btambah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                simpanData();
            }
        });
        updateTable();
    }

    private void updateTable() {
        while (tabel4data.getChildCount() > 1) {
            tabel4data.removeViewAt(1);
        }

        double aa = tabel4data.getChildCount();
        String a = String.valueOf(aa);
        Toast.makeText(getBaseContext(), "tabel data child ! " + a, Toast.LENGTH_SHORT).show();

        ArrayList <ArrayList<Object>> data = dm. ambilSemuaBaris();

        for (int posisi = 0; posisi < data.size(); posisi++) {
            TableRow tabelBaris = new TableRow(this);
            ArrayList<Object> baris = data.get(posisi);
            TextView idTxt = new TextView(this);
            idTxt.setText(baris.get(0).toString());
            tabelBaris.addView(idTxt);
            TextView namaTxt = new TextView(this);
            namaTxt.setText(baris.get(1).toString());
            tabelBaris.addView(namaTxt);
            TextView hobiTxt = new TextView(this);
            hobiTxt.setText(baris.get(2).toString());
            tabelBaris.addView(hobiTxt);
            tabel4data.addView(tabelBaris);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private void simpanData(){
        try {
            dm.addRow(inama.getText().toString(), isekolah.getText().toString());
            Toast.makeText(getBaseContext(), inama.getText().toString() + ", berhasil disimpan", Toast.LENGTH_SHORT).show();
            updateTable();
        } catch (Exception e){
            e.printStackTrace();
            Toast.makeText(getBaseContext(),"Bal simpan, "+e.toString(),Toast.LENGTH_LONG).show();
        }
    }

    private void kosongkanfield(){
        inama.setText("");
        isekolah.setText("");
    }
}

