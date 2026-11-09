package praktikum;

import java.sql.*;

public class Matakuliah extends javax.swing.JFrame {
    String databaseURL = "jdbc:ucanaccess://F:/Dev/JAVA/Praktikum 16/akademik/akademik.accdb";

    public Matakuliah() {
        initComponents();
        readMatakuliah();
    }
    
    public void readMatakuliah(){
        try {
            Connection connection = DriverManager.getConnection(databaseURL);
            String sql = "SELECT * FROM Matakuliah";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                String Kode_Matakuliah = result.getString("Kode_Matakuliah");
                String Matakuliah = result.getString("Matakuliah");
                String SKS = result.getString("SKS");
                String Semester = result.getString("Semester");
                
                list_matakuliah.add("[" + Kode_Matakuliah + "] [" + Matakuliah + "] [" + SKS + "] [" + Semester + "]");
                connection.close();
            }
            list_matakuliah.add("=========================================================");
    	} catch (SQLException e) {
	      e.printStackTrace();
    	}
    }
    
    private void createMatakuliah(String Matakuliah, String SKS, String Semester){
        try {
            Connection connection = DriverManager.getConnection(databaseURL);
            String sql = "INSERT INTO Matakuliah (Matakuliah, SKS, Semester) VALUES ('" + Matakuliah + "', '" + SKS + "', '" + Semester + "')";
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
    
    private void updateMatakuliah(String Kode_Matakuliah, String Matakuliah, String SKS, String Semester){
        try {
            Connection connection = DriverManager.getConnection(databaseURL);
            String sql = "UPDATE Matakuliah SET Matakuliah = '" + Matakuliah + "', SKS = '" + SKS + "', Semester = '" + Semester + "' WHERE Kode_Matakuliah = " + Kode_Matakuliah;
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);
            if(rows > 0) {
                System.out.println("Data Telah Berhasil Diubah");
            }	
            connection.close();
    	} catch (SQLException e) {
	      e.printStackTrace();
    	}
    }
    
    private void deleteMatakuliah(String Kode_Matakuliah){
        try {
            Connection connection = DriverManager.getConnection(databaseURL);
            String sql = "DELETE FROM Matakuliah WHERE Kode_Matakuliah = " + Kode_Matakuliah;
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);
            if(rows > 0) {
                    System.out.println("Data Telah Berhasil Dihapus");
            }	
            connection.close();
    	} catch (SQLException e) {
	      e.printStackTrace();
    	}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        input_matakuliah = new javax.swing.JTextField();
        input_sks = new javax.swing.JTextField();
        input_semester = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        input_kode = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        list_matakuliah = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Matakuliah:");

        jLabel2.setText("SKS:");

        jLabel3.setText("Semester:");

        input_matakuliah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_matakuliahActionPerformed(evt);
            }
        });

        input_sks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_sksActionPerformed(evt);
            }
        });

        input_semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_semesterActionPerformed(evt);
            }
        });

        jLabel4.setText("Kode:");

        input_kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_kodeActionPerformed(evt);
            }
        });

        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        list_matakuliah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_matakuliahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(input_sks, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_matakuliah, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_semester, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(list_matakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(input_matakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(input_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_sks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert)
                    .addComponent(update)
                    .addComponent(refresh)
                    .addComponent(delete))
                .addGap(22, 22, 22)
                .addComponent(list_matakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_matakuliahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_matakuliahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_matakuliahActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        createMatakuliah(input_matakuliah.getText(), input_sks.getText(), input_semester.getText());
    }//GEN-LAST:event_insertActionPerformed

    private void list_matakuliahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_matakuliahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_matakuliahActionPerformed

    private void input_sksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_sksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_sksActionPerformed

    private void input_semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_semesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_semesterActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        deleteMatakuliah(input_kode.getText());
    }//GEN-LAST:event_deleteActionPerformed

    private void input_kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_kodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_kodeActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        updateMatakuliah(input_kode.getText(), input_matakuliah.getText(), input_sks.getText(), input_semester.getText());
    }//GEN-LAST:event_updateActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        readMatakuliah();
    }//GEN-LAST:event_refreshActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matakuliah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JTextField input_kode;
    private javax.swing.JTextField input_matakuliah;
    private javax.swing.JTextField input_semester;
    private javax.swing.JTextField input_sks;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.List list_matakuliah;
    private javax.swing.JButton refresh;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
