/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.timone.gate;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkIJTheme;
import com.timone.connection.DBConnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


/**
 *
 * @author Fadel
 */
public class SetupPage extends javax.swing.JFrame {

    /**
     * Creates new form formSetting
     */
    public SetupPage() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        focusSet();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        namaPemilik = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        rfid = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        namaUsaha = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        teleponUsaha = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        createAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Hello there!");

        namaPemilik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPemilikActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setText("Untuk memulai, silakan isi formulir di bawah ini,");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("untuk membuat akun baru.");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Nama");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Username");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("Password");

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        rfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfidActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("Kode Akses");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setText("Kode akses adalah kode unik yang digunakan");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setText("untuk login. Kode ini bersifat tunggal dan dapat");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setText("diperoleh melalui pemindaian RFID, Barcode,");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setText("atau kunci keamanan (security key).");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setText("Nama Usaha");

        namaUsaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaUsahaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel13.setText("Alamat");

        teleponUsaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleponUsahaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel14.setText("Nomor Telepon (Bisnis)");

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel16.setText("Data terkait usaha ini akan digunakan untuk");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel17.setText("membuat rincian laporan, mencetak struk,");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel18.setText("dan form pemesanan. Pastikan data valid dan");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel19.setText("terisi dengan benar.");

        createAccount.setText("Buat Akun");
        createAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(password)
                    .addComponent(rfid)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namaPemilik))
                .addGap(47, 47, 47)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addComponent(namaUsaha)
                    .addComponent(jLabel12)
                    .addComponent(teleponUsaha)
                    .addComponent(jLabel14)
                    .addComponent(alamat)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaUsaha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teleponUsaha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(createAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel16)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel17)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel18)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel19))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(namaPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rfid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel8)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel9)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel10)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel11))
                        .addComponent(jSeparator1)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rfidActionPerformed

    private void namaPemilikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPemilikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPemilikActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void namaUsahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaUsahaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaUsahaActionPerformed

    private void teleponUsahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleponUsahaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleponUsahaActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void createAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountActionPerformed
        try {
            InsertAbout();
        } catch (SQLException ex) {
            Logger.getLogger(SetupPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_createAccountActionPerformed
    
    private void focusSet(){
        namaPemilik.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            username.requestFocusInWindow(); // Memindahkan fokus ke JPasswordField
        }
    });
        
        username.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            password.requestFocusInWindow(); // Memindahkan fokus ke JPasswordField
        }
    });
        
        password.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            rfid.requestFocusInWindow(); // Memindahkan fokus ke JPasswordField
        }
    });
        
        rfid.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            namaUsaha.requestFocusInWindow(); // Memindahkan fokus ke JPasswordField
        }
    });
        
        namaUsaha.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            teleponUsaha.requestFocusInWindow(); // Memindahkan fokus ke JPasswordField
        }
    });
        
        teleponUsaha.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            alamat.requestFocusInWindow(); // Memindahkan fokus ke JPasswordField
        }
    });
        
        alamat.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            try {
                InsertAbout();
            } catch (SQLException ex) {
                Logger.getLogger(SetupPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    });
        
        
    }
    
    private void InsertAbout() throws SQLException {
    // Mengambil nilai dari field input
    String namaPemilikValue = namaPemilik.getText();
    String namaUsahaValue = namaUsaha.getText();
    String teleponUsahaValue = teleponUsaha.getText();
    String alamatValue = alamat.getText();
    String usernameValue = username.getText();
    String passwordValue = new String(password.getPassword()); // Password sebaiknya diambil sebagai char array
    String rfidValue = new String(rfid.getPassword()); // Juga untuk kode akses

    // Mendapatkan koneksi ke database dari kelas DBConnection
    Connection conn = DBConnection.getConnection();

    if (conn != null) {
        ResultSet resultSet = null; // Declare ResultSet here

        try {
            // Memeriksa keberadaan username dan password yang sama
            String checkQuery = "SELECT COUNT(*) FROM akun_karyawan WHERE username = ? AND password = ?";
            PreparedStatement checkStatement = conn.prepareStatement(checkQuery);
            checkStatement.setString(1, usernameValue);
            checkStatement.setString(2, passwordValue);
            resultSet = checkStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "Username dan password sudah digunakan untuk karyawan. Harap gunakan yang lain.");
                username.setText("");
                password.setText("");
                username.requestFocusInWindow();
                username.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        password.requestFocusInWindow();
                    }
                });
                password.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            InsertAbout();
                        } catch (SQLException ex) {
                            Logger.getLogger(SetupPage.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                });
                return; // Keluar dari metode jika username dan password sudah ada
            }

            // Menyiapkan kueri SQL
            String query = "INSERT INTO about (nama_pemilik, nama_usaha, no_telp_usaha, alamat, username, password, rfid) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);

            // Mengisi nilai parameter kueri
            statement.setString(1, namaPemilikValue);
            statement.setString(2, namaUsahaValue);
            statement.setString(3, teleponUsahaValue);
            statement.setString(4, alamatValue);
            statement.setString(5, usernameValue);
            statement.setString(6, passwordValue);
            statement.setString(7, rfidValue);

            // Menjalankan kueri
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                this.dispose();
                new LoginPage().setVisible(true);  
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengunggah ke database");
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close(); // Close ResultSet
                }
                conn.close(); // Tutup koneksi setelah selesai digunakan
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menutup koneksi");
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Gagal terhubung ke database");
    }
}

    
    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        FlatLaf.registerCustomDefaultsSource("com.timone.theme.properties");
        FlatGitHubDarkIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SetupPage form = new SetupPage();
                form.setLocationRelativeTo(null); // Memposisikan jendela di tengah layar
                form.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton createAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField namaPemilik;
    private javax.swing.JTextField namaUsaha;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField rfid;
    private javax.swing.JTextField teleponUsaha;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}