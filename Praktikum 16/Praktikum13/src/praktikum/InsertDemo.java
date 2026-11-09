package praktikum;

import java.sql.*;

class InsertDemo {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
            Connection conn = DriverManager.getConnection("jdbc:odbc:akademik");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO MHS VALUES('10', 'Syahrini', 'Jakarta')");
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Akses gagal...");
        }
    }
}