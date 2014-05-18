/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Video;

import Main.MenuLoginAdmin;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class VideoSwing extends javax.swing.JFrame {
    
    /**
     * Creates new form VideoF
     */
    
    Video V;
    private List<String> L;
    
    public VideoSwing() {
        initComponents();
        V = new Video();
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
        jLabel4 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        no_tubes = new javax.swing.JTextField();
        group_name = new javax.swing.JTextField();
        link = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Title");

        jLabel2.setText("No Tubes");

        jLabel3.setText("Group Name");

        jLabel4.setText("Link");

        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(group_name, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(no_tubes)
                    .addComponent(title)
                    .addComponent(link))
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no_tubes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(group_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(EditButton))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        if(!cek()){
            JOptionPane.showMessageDialog(rootPane, "Kolom yang kosong harus diisi..!", "KatalogV Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Apa anda yakin untuk menyimpan data ini?","Warning",dialogButton);

            if(dialogResult == JOptionPane.YES_OPTION){
                try {
                    V.setTitle(title.getText());
                    V.setNo_tubes(Integer.parseInt(no_tubes.getText()));
                    V.setGroup_name(group_name.getText());
                    V.setLink(link.getText());

                    V.Insert();

                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan...");
                    clean();
                } catch (AttributeException x) {
                    Logger.getLogger(VideoSwing.class.getName()).log(Level.SEVERE, null, x);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ada Kesalahan...");
                    Logger.getLogger(VideoSwing.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NullException n) {
                    JOptionPane.showMessageDialog(null, n.getMessage());
                    Logger.getLogger(VideoSwing.class.getName()).log(Level.SEVERE, null, n);
                } catch (NumberFormatException nf) {
                    JOptionPane.showMessageDialog(null, "Masukan data sesuai tipenya");
                    Logger.getLogger(VideoSwing.class.getName()).log(Level.SEVERE, null, nf);
                }
            }
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        /*try {
            if(cek() && V.cekDataVideo(Integer.parseInt(id.getText()))){
                GroupJFrameEdit gjf = new GroupJFrameEdit(no_tubes.getText(), group_name.getText());
                b_save.setVisible(false);
                b_update.setVisible(true);
                //gjf.setTemp(no_tubes.getText(), group_name.getText());
                gjf.setVisible(true);
                this.setVisible(false);
//
//                g.select_group_by(Integer.parseInt(no_tubes.getText()), group_name.getText());
//
//                anggota_1.setText(g.getMember().get(0));
//                anggota_2.setText(g.getMember().get(1));
//                anggota_3.setText(g.getMember().get(2));

                JOptionPane.showMessageDialog(null, "Data ditemukan...");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Data tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            
            Logger.getLogger(GroupJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_EditButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MenuLoginAdmin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        final int Width = screenSize.width;
        final int Height = screenSize.height;
        int lebar = (int) this.getSize().getWidth() / 2;
        int tinggi = (int) this.getSize().getHeight() / 2;
        // Setup the frame accordingly
        // This is assuming you are extending the JFrame //class
        this.setLocation((Width/2) - lebar, (Height/2) - tinggi);
    }//GEN-LAST:event_formWindowActivated
    
    public boolean cek(){
        return !title.getText().equals("") && !group_name.getText().equals("") && !no_tubes.getText().equals("") && !link.getText().equals("");
    }
    public void clean(){
        no_tubes.setText("");
        group_name.setText("");
        title.setText("");
        link.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField group_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField link;
    private javax.swing.JTextField no_tubes;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
