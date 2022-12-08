package Menu;
import Database.Koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
import Database.dataOrganisasi;
import java.util.logging.Level;
import java.util.logging.Logger;
import Database.dataOrganisasi;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.util.zip.CheckedInputStream;

public class MenuDataOrganisasi extends javax.swing.JFrame {
    dataOrganisasi data_Organisasi;
    /**
     * Creates new form MenuDataOrganisasi
     */
    public MenuDataOrganisasi() throws ClassNotFoundException, SQLException {
        data_Organisasi = new dataOrganisasi();
        initComponents();
        this.showData();
    }
    
    public boolean checkinput(){
        if(txtnim.getText().isEmpty()) return false;
        if(txtnama.getText().isEmpty()) return false;
        if(txtdivisi.getText().isEmpty()) return false;
        if(txtdepartemen.getText().isEmpty()) return false;
        
        return true;
    }
    
        void filter(KeyEvent b){
        if((Character.isDigit(b.getKeyChar())) && (Character.isJavaIdentifierPart(b.getKeyChar())) ){
            b.consume();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbhimatol = new javax.swing.JTable();
        Kembali = new javax.swing.JButton();
        tambahdata = new javax.swing.JButton();
        update = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtdivisi = new javax.swing.JTextField();
        txtdepartemen = new javax.swing.JTextField();
        txtnim = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("DATA ANGGOTA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        tbhimatol = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        tbhimatol.getTableHeader().setReorderingAllowed(false);
        tbhimatol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "NAMA", "DIVISI", "DEPARTEMEN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbhimatol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbhimatolMouseClicked(evt);
            }
        });
        tbhimatol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbhimatolKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(tbhimatol);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 482, 130));

        Kembali.setBackground(new java.awt.Color(0, 0, 0));
        Kembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Kembali.setForeground(new java.awt.Color(255, 255, 102));
        Kembali.setText("Kembali");
        Kembali.setBorderPainted(false);
        Kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KembaliMouseClicked(evt);
            }
        });
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        jPanel1.add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        tambahdata.setBackground(new java.awt.Color(0, 0, 0));
        tambahdata.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tambahdata.setForeground(new java.awt.Color(204, 204, 204));
        tambahdata.setText("Tambah");
        tambahdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahdataMouseClicked(evt);
            }
        });
        tambahdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahdataActionPerformed(evt);
            }
        });
        jPanel1.add(tambahdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        update.setBackground(new java.awt.Color(0, 0, 0));
        update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update.setForeground(new java.awt.Color(102, 102, 255));
        update.setText("Ubah");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        hapus.setBackground(new java.awt.Color(0, 0, 0));
        hapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hapus.setForeground(new java.awt.Color(255, 102, 102));
        hapus.setText("Hapus");
        hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusMouseClicked(evt);
            }
        });
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jPanel1.add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAMA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DIVISI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DEPARTEMEN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        txtnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnamaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnamaKeyTyped(evt);
            }
        });
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 330, -1));

        txtdivisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdivisiActionPerformed(evt);
            }
        });
        txtdivisi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdivisiKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdivisiKeyTyped(evt);
            }
        });
        jPanel1.add(txtdivisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 330, -1));

        txtdepartemen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdepartemenActionPerformed(evt);
            }
        });
        txtdepartemen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdepartemenKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdepartemenKeyTyped(evt);
            }
        });
        jPanel1.add(txtdepartemen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 330, -1));

        txtnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnimActionPerformed(evt);
            }
        });
        txtnim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnimKeyTyped(evt);
            }
        });
        jPanel1.add(txtnim, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 330, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NIM");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 40, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 570, 460));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\Jadwal Kuliah Semester 3\\Pemrograman Berorientasi Objek\\SS\\struktur-organisasi-vector-17-removebg-preview.png")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnimActionPerformed

    private void txtdivisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdivisiActionPerformed

    }//GEN-LAST:event_txtdivisiActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        while (true){
        if(txtnama.getText().matches("[a-zA-Z]+")){
            break;
        }else{
            JOptionPane.showMessageDialog(null, "eror");
            this.dispose();
            try {
                new MenuDataOrganisasi().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MenuDataOrganisasi.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MenuDataOrganisasi.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
        }
        }
    }//GEN-LAST:event_txtnamaActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed

    }//GEN-LAST:event_hapusActionPerformed

    private void hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseClicked
        String NIM = txtnim.getText();
        data_Organisasi.deleteAnggota(NIM);
        JOptionPane.showMessageDialog(null, "Hapus data berhasil");
        this.dispose();
        try {
            new MenuDataOrganisasi().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuDataOrganisasi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuDataOrganisasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hapusMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        if (checkinput()) {
        String n = txtnim.getText();
        String na = txtnama.getText();
        String dv = txtdivisi.getText();
        String jb = txtdepartemen.getText();

        data_Organisasi.updateAnggota(n, na, dv, jb);
        JOptionPane.showMessageDialog(null, "Data berhasil di Ubah");
        this.dispose();
        try {
            new MenuDataOrganisasi().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuDataOrganisasi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuDataOrganisasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
        }
    }//GEN-LAST:event_updateMouseClicked

    private void tambahdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahdataActionPerformed

    }//GEN-LAST:event_tambahdataActionPerformed

    private void tambahdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahdataMouseClicked
        if (checkinput()) {
        String n = txtnim.getText();
        String na = txtnama.getText();
        String dv = txtdivisi.getText();
        String jb = txtdepartemen.getText();

        data_Organisasi.insertdataAnggota(n, na, dv, jb);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
        this.dispose();
        try {
            new MenuDataOrganisasi().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuDataOrganisasi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuDataOrganisasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
        }
    }//GEN-LAST:event_tambahdataMouseClicked

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KembaliActionPerformed

    private void KembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KembaliMouseClicked

        MenuUtama m = new MenuUtama();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KembaliMouseClicked

    private void tbhimatolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbhimatolMouseClicked

        int baris = tbhimatol.rowAtPoint(evt.getPoint());
        String NIM = tbhimatol.getValueAt(baris, 0).toString();
        txtnim.setText(NIM);

        String NAMA = tbhimatol.getValueAt(baris, 1).toString();
        txtnama.setText(NAMA);

        String DIVISI = tbhimatol.getValueAt(baris, 2).toString();
        txtdivisi.setText(DIVISI);

        String DEPARTEMEN = tbhimatol.getValueAt(baris, 3).toString();
        txtdepartemen.setText(DEPARTEMEN);
       
    }//GEN-LAST:event_tbhimatolMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void tbhimatolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbhimatolKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tbhimatolKeyTyped

    private void txtnimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnimKeyTyped
        char karakter = evt.getKeyChar();
        if(!((karakter >= '0')&& (karakter <= '9')&& txtnim.getText().length()<10 || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtnimKeyTyped

    private void txtnamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamaKeyTyped
        filter(evt);
    }//GEN-LAST:event_txtnamaKeyTyped

    private void txtnamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamaKeyPressed
      if (evt.getKeyCode()==20){
        while (true){
        if(txtnama.getText().matches("[a-zA-Z]+")){
            txtdivisi.requestFocus();
            break;
        }else{
            JOptionPane.showMessageDialog(null, "Eror");
            this.dispose();
            try {
                new MenuDataOrganisasi().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MenuDataOrganisasi.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MenuDataOrganisasi.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
        }}
      }
    }//GEN-LAST:event_txtnamaKeyPressed

    private void txtdepartemenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdepartemenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdepartemenActionPerformed

    private void txtdivisiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdivisiKeyPressed
        if (evt.getKeyCode()==20){
        while (true){
        if(txtdivisi.getText().matches("[a-zA-Z]+")){
            txtdepartemen.requestFocus();
            break;
        }else{
            JOptionPane.showMessageDialog(null, "Eror");
            this.dispose();
            try {
                new MenuDataOrganisasi().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MenuDataOrganisasi.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MenuDataOrganisasi.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
        }}
      }
    }//GEN-LAST:event_txtdivisiKeyPressed

    private void txtdivisiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdivisiKeyTyped
        filter(evt);
    }//GEN-LAST:event_txtdivisiKeyTyped

    private void txtdepartemenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdepartemenKeyTyped
        filter(evt);
    }//GEN-LAST:event_txtdepartemenKeyTyped

    private void txtdepartemenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdepartemenKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdepartemenKeyPressed

    public void showData() throws SQLException {
        tbhimatol.setModel(new javax.swing.table.DefaultTableModel(
        data_Organisasi.showAnggota(),
            new String [] {
            "NIM", "NAMA", "DIVISI", "DEPARTEMEN"
                    
            }
        ));}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuDataOrganisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDataOrganisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDataOrganisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDataOrganisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new MenuDataOrganisasi().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MenuDataOrganisasi.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(MenuDataOrganisasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kembali;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton tambahdata;
    private javax.swing.JTable tbhimatol;
    private javax.swing.JTextField txtdepartemen;
    private javax.swing.JTextField txtdivisi;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
