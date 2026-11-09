package praktikum;

import java.sql.*;

class SelectDemo {
    public static void main(String[] args) {
    	String databaseURL = "jdbc:ucanaccess://akademik.accdb";
    	
    	try {
        	Connection conn = DriverManager.getConnection(databaseURL);

        	System.out.println("Terhubung Ke MS Access Database");
        	
        	String sql = "INSERT INTO Mahasiswa (NIM, Nama, Alamat, Tgl_Lahir) VALUES " 
        	+ " ('18106050046', 'Muhammad Naufan', 'Randusongo', '18/06/2000') ";
        	
        	Statement statement = conn.createStatement();
        	int rows = statement.executeUpdate(sql);
        	
        	if(rows > 0) {
        		System.out.println("Data Telah Berhasil Ditambahkan");
        	}
        	
        	conn.close();
    	} catch (SQLException e) {
	      e.printStackTrace();
    	}
    	
//    	try {
//            DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
//            try (Connection conn = DriverManager.getConnection("jdbc:odbc:akademik")) {
//                Statement stmt = conn.createStatement();
//                ResultSet rs = stmt.executeQuery("SELECT * FROM MHS");
//                while (rs.next()) {
//                    System.out.println("NIM = " +rs.getString(1));
//                    System.out.println("NAMA = " +rs.getString(2));
//                    System.out.println("ALAMAT = " +rs.getString(3));
//                    System.out.println();
//                }
//                rs.close();
//                stmt.close();
//                conn.close();
//            }
//        } catch (SQLException e) {
//            System.out.println("Akses gagal...");
//        }
    }
}