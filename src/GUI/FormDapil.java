/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
import Tools.KoneksiDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import main.Dapil;
import main.DataDapil;
/**
 *
 * @author linda.sekawati
 */
public class FormDapil extends javax.swing.JFrame {

    /**
     * Creates new form FormDapil
     */
    private DefaultTableModel model;
    public FormDapil() {
        initComponents();
        model = new DefaultTableModel();
        TabelDapil.setModel(model);
        
        model.addColumn("No. Dapil");
        model.addColumn("Kota/Kabupaten");
        loadData();
    }
    
    private void loadData(){
     model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try
        {
            Connection koneksi = KoneksiDatabase.getKoneksi();
            Statement statement = koneksi.createStatement();
            
            String command = "SELECT * FROM Kabupaten";
            ResultSet result = statement.executeQuery(command);
            
            while (result.next())
            {
                Object [] o = new Object[5];
                o[0] = result.getString("No_Dapil");
                o[1] = result.getString("Nama_Kabupaten");
                
                model.addRow(o);
            }
            result.close();
            statement.close();
        }
        catch (SQLException e)
        {
            System.out.println("Terjadi eror FormDapil.java: " + e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NoDapil = new javax.swing.JTextField();
        Tambah = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelDapil = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        KotKab = new javax.swing.JTextArea();
        KembaliFormAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Input Dapil");

        jLabel2.setText("No Dapil              :");

        jLabel3.setText("Kota/Kabupaten :");

        NoDapil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoDapilActionPerformed(evt);
            }
        });

        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        jLabel4.setText("Daftar");

        TabelDapil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "No. Dapil", "Kota/Kabupaten"
            }
        ));
        TabelDapil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelDapilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelDapil);

        KotKab.setColumns(20);
        KotKab.setRows(5);
        jScrollPane2.setViewportView(KotKab);

        KembaliFormAdmin.setText("Kembali");
        KembaliFormAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliFormAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(264, 264, 264)
                                .addComponent(KembaliFormAdmin))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NoDapil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Tambah)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(KembaliFormAdmin)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NoDapil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tambah)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoDapilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoDapilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoDapilActionPerformed

    private void KembaliFormAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliFormAdminActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FormAdmin FA = new FormAdmin();
        FA.setVisible(true);
    }//GEN-LAST:event_KembaliFormAdminActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
         // TODO add your handling code here:
        String nodapil = NoDapil.getText();
        String kotkab = KotKab.getText();
        try
        {
            Connection c = DataDapil.getKoneksi();
            String sql = "INSERT INTO YukCoblos VALUES (?, ?)";
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1, nodapil);
            p.setString(2, kotkab);
            
            p.executeUpdate();
            p.close();
        }
        catch(SQLException e)
        {
            System.out.println("Terjadi Error");
        }
        finally
        {
            loadData();
        }
    }//GEN-LAST:event_TambahActionPerformed

    private void TabelDapilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDapilMouseClicked
        // TODO add your handling code here:
        int i = TabelDapil.getSelectedRow();
        if(i == -1){
            return;
        }
        
        String nodapil = (String) model.getValueAt(i, 0);
        NoDapil.setText(nodapil);
        
        String kotkab = (String) model.getValueAt(i, 1);
        KotKab.setText(kotkab);
    }//GEN-LAST:event_TabelDapilMouseClicked
    
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
            java.util.logging.Logger.getLogger(FormDapil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDapil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDapil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDapil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDapil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KembaliFormAdmin;
    private javax.swing.JTextArea KotKab;
    private javax.swing.JTextField NoDapil;
    private javax.swing.JTable TabelDapil;
    private javax.swing.JButton Tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
