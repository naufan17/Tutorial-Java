package praktikum;

import java.sql.*;

class SelectDemo {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
            try (Connection conn = DriverManager.getConnection("jdbc:odbc:akademik")) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM MHS");
                while (rs.next()) {
                    System.out.println("NIM = " +rs.getString(1));
                    System.out.println("NAMA = " +rs.getString(2));
                    System.out.println("ALAMAT = " +rs.getString(3));
                    System.out.println();
                }
                rs.close();
                stmt.close();
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Akses gagal...");
        }
    }
}
