/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.timone.main.admin.tableLogic;
import com.timone.connection.DbConnection;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author Fadel
 */
public class SalesLogic {
    public static void salesTable(JTable jTable2) {
        try {
            // Mendapatkan koneksi ke database dari kelas DbConnection
            Connection conn = DbConnection.getConnection();

            // Membuat statement SQL untuk mengambil data penjualan
            String sql = "SELECT dp.kode_penjualan, p.tanggal_transaksi, k.username AS user, dp.kode_barang, b.nama_barang, dp.jumlah_terjual AS barang_terjual, dp.laba_pcs, dp.laba_total " +
                    "FROM detail_penjualan dp " +
                    "JOIN penjualan p ON dp.kode_penjualan = p.kode_penjualan " +
                    "JOIN barang b ON dp.kode_barang = b.kode_barang " +
                    "JOIN akun_karyawan k ON p.kode_user = k.kode_user";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Mendapatkan model tabel yang ada
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

            // Menghapus semua baris yang sudah ada dari model tabel
            model.setRowCount(0);

            // Memproses hasil kueri dan menambahkannya ke model tabel
            while (rs.next()) {
                Object[] row = {
                        rs.getString("kode_penjualan"),
                        rs.getDate("tanggal_transaksi"),
                        rs.getString("user"),
                        rs.getString("kode_barang"),
                        rs.getString("nama_barang"),
                        rs.getInt("barang_terjual"),
                        rs.getInt("laba_pcs"),
                        rs.getInt("laba_total")
                };
                model.addRow(row);
            }

            // Menutup koneksi
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        jTable2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int r = jTable2.rowAtPoint(e.getPoint());
                if (r >= 0 && r < jTable2.getRowCount()) {
                    jTable2.setRowSelectionInterval(r, r);
                } else {
                    jTable2.clearSelection();
                }

                int rowIndex = jTable2.getSelectedRow();
                if (rowIndex < 0)
                    return;

                if (e.isPopupTrigger() && e.getComponent() instanceof JTable) {
                    JPopupMenu popup = new JPopupMenu();

                    // Tambahkan opsi yang ingin Anda tampilkan di sini
                    JMenuItem option1 = new JMenuItem("Opsi 1");
                    JMenuItem option2 = new JMenuItem("Opsi 2");

                    // Tambahkan action listener untuk setiap opsi
                    option1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            // Tindakan yang akan dilakukan ketika opsi 1 dipilih
                            System.out.println("Opsi 1 dipilih pada baris: " + rowIndex);
                        }
                    });

                    option2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            // Tindakan yang akan dilakukan ketika opsi 2 dipilih
                            System.out.println("Opsi 2 dipilih pada baris: " + rowIndex);
                        }
                    });

                    // Tambahkan opsi ke menu popup
                    popup.add(option1);
                    popup.add(option2);

                    // Tampilkan menu popup di posisi klik mouse
                    popup.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }
}
