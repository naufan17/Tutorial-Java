package praktikum;

import java.sql.*;

class InsertDemo {
    public static void main(String[] args) {
    	String databaseURL = "jdbc:ucanaccess://F:/Dev/JAVA/Praktikum 17/akademik.accdb";
    	
    	try {
        	Connection connection = DriverManager.getConnection(databaseURL);

        	System.out.println("Terhubung Ke MS Access Database");
        	
        	String sql = "INSERT INTO Mahasiswa (NIM, Nama, Alamat) VALUES ('50046', 'Muhammad Naufan', 'Randusongo')";
        	
        	Statement statement = connection.createStatement();
        	int rows = statement.executeUpdate(sql);
        	
        	if(rows > 0) {
        		System.out.println("Data Telah Berhasil Ditambahkan");
        	}
        	
        	connection.close();
    	} catch (SQLException e) {
	      e.printStackTrace();
    	}

    }
}
