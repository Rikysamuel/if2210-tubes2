/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;


import Group.Group;
import Group.GroupJFrameEdit;
import Video.VideoController;
import VideoPlayer.YoutubeDataRetriever;
import VideoPlayer.YoutubeMediaPlayer;
import Xml.StaxWriter;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import com.google.gdata.util.ServiceException;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Rikysamuel
 */
public class GuestView extends javax.swing.JFrame {
    private int videodata;
    private final List<String[]> viddetails;
    private final VideoController VC;
    private final YoutubeDataRetriever YDR;
    private final List<String> vidRating;
    
    /**
     * Creates new form GuestView
     * @throws java.sql.SQLException
     * @throws java.io.IOException
     * @throws com.google.gdata.util.ServiceException
     */
    public GuestView() throws SQLException, IOException, ServiceException {
        videodata = 0;
        VC = new VideoController();
        YDR = new YoutubeDataRetriever();
        viddetails = VC.SelectVideoData();
        vidRating =  new ArrayList<>();
        //stX = new StaxParser();   
        initComponents();
        jLabel1.setText(YDR.getTitle(viddetails.get(0)[2]));
        jLabel5.setText(String.valueOf(YDR.getView(viddetails.get(0)[2])));
        jLabel2.setText(viddetails.get(0)[5]);
        jButton5.setVisible(false);
        bUbah.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jPanel3 = new YoutubeMediaPlayer(viddetails.get(0)[2]);
        jButton4 = new javax.swing.JButton();
        b_rating = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("KataMa Player");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Title");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Group Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("View :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Rating :");

        jButton1.setText("Sebelumnya");
        jButton1.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Selanjutnya");
        jButton2.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jPanel3.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 811, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jButton4.setText("Log Out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        b_rating.setText("Submit Rating");
        b_rating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ratingActionPerformed(evt);
            }
        });

        bUbah.setText("Ubah Data Grup");
        bUbah.setToolTipText("");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        jButton3.setText("Cari Video");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("View");

        jButton5.setText("Ubah Data Video");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_rating)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 652, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bUbah)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(bUbah)
                            .addComponent(jButton5))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(b_rating)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (videodata>0){
            try {
                jButton2.setEnabled(true);
                videodata--;
                jLabel1.setText(YDR.getTitle(viddetails.get(videodata)[2]));
                jLabel2.setText(viddetails.get(videodata)[5]);
                jLabel5.setText(String.valueOf(YDR.getView(viddetails.get(videodata)[2])));
                jPanel3.setURL(viddetails.get(videodata)[2]);
//            if(vidRating.get(videodata)!=null)
//                jLabel4.setText(vidRating.get(videodata));
                if (videodata==0){
                    jButton1.setEnabled(false);
                }
            } catch (IOException | ServiceException ex) {
                Logger.getLogger(GuestView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{
            jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public JButton RetUbahVideo(){
        return jButton5;
    }
    
    public JButton RetUbahGrup(){
        return bUbah;
    }
    
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jRadioButton1.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
        jLabel4.setText("Rating : 1");
        vidRating.add(videodata, jLabel4.getText());
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
        jLabel4.setText("Rating : 2");
        vidRating.add(videodata, jLabel4.getText());
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton5.setSelected(false);
        jLabel4.setText("Rating : 3");
        vidRating.add(videodata, jLabel4.getText());
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jLabel4.setText("Rating : 4");
        vidRating.add(videodata, jLabel4.getText());
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
        jLabel4.setText("Rating : 5");
        vidRating.add(videodata, jLabel4.getText());
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (videodata<viddetails.size()-1){
            try {
                jButton1.setEnabled(true);
                videodata++;
                jLabel1.setText(YDR.getTitle(viddetails.get(videodata)[2]));
                jLabel2.setText(viddetails.get(videodata)[5]);
                jLabel5.setText(String.valueOf(YDR.getView(viddetails.get(videodata)[2])));
//            if(vidRating.get(videodata)!=null)
//                jLabel4.setText(vidRating.get(videodata));
                jPanel3.setURL(viddetails.get(videodata)[2]);
                if (videodata==viddetails.size()-1){
                    jButton2.setEnabled(false);
                }
            } catch (IOException ex) {
                Logger.getLogger(GuestView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ServiceException ex) {
                Logger.getLogger(GuestView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            jButton2.setEnabled(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Are You Sure Want to Logout?", "Confirmation", 0)==0){
            new KataMa().setVisible(true);
            this.setVisible(false);
            NativeInterface.close();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        final int WIDTH = screenSize.width;
        final int HEIGHT = screenSize.height;
        int lebar = (int) this.getSize().getWidth() / 2;
        int tinggi = (int) this.getSize().getHeight() / 2;
        // Setup the frame accordingly
        // This is assuming you are extending the JFrame //class
        this.setLocation((WIDTH/2) - lebar, (HEIGHT/2) - tinggi);
    }//GEN-LAST:event_formWindowActivated

    private void b_ratingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ratingActionPerformed
        try 
        {
            StaxWriter configFile = new StaxWriter();
            configFile.setConfigFile("xml/ratings.xml");
            configFile.setRating(vidRating);
            configFile.setVid(viddetails);
            configFile.saveConfig();
        } catch (Exception ex) {
            Logger.getLogger(GuestView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b_ratingActionPerformed

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        Group g = new Group();
        try {
            if(cek() && g.cekDataGroup(Integer.parseInt(viddetails.get(videodata)[4]), viddetails.get(videodata)[5])){
                GroupJFrameEdit gjf = new GroupJFrameEdit(viddetails.get(videodata)[4], viddetails.get(videodata)[5]);
                JOptionPane.showMessageDialog(null, "Data ditemukan...");
                gjf.setVisible(true);
                this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Data tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GroupJFrameEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bUbahActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String NoTubes = JOptionPane.showInputDialog(this, "Masukan Tubes");
            String NamaKelompok = JOptionPane.showInputDialog(this, "Masukan Kelompok");
            String link = VC.LinkVideo(Integer.valueOf(NoTubes), NamaKelompok);
            jPanel3.setURL(link);
            try {
                jLabel1.setText(YDR.getTitle(link));
            } catch (IOException | ServiceException ex) {
                Logger.getLogger(GuestView.class.getName()).log(Level.SEVERE, null, ex);
            }
            jLabel2.setText(NamaKelompok);
            try {
                jLabel5.setText(String.valueOf(YDR.getView(link)));
            } catch (IOException | ServiceException ex) {
                Logger.getLogger(GuestView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (HeadlessException | NumberFormatException | SQLException e){
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public boolean cek(){
        return !jLabel1.getText().equals("") && !jLabel2.getText().equals("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bUbah;
    private javax.swing.JButton b_rating;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private YoutubeMediaPlayer jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables

}
