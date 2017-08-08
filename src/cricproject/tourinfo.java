/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricproject;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class tourinfo extends javax.swing.JFrame {
 private DatabaseHandler ob1 = new DatabaseHandler();
 private String tableName = null;
     
    public tourinfo() {
        initComponents();
        ob1.setConnection();
        tourlist();
    }
    
    private void tourlist(){
        try {
            
            ResultSet result = ob1.showList("SELECT * FROM tournament");
            
            DefaultListModel listModel =  (DefaultListModel) tlist.getModel();
            
            listModel.removeAllElements();
            
            while(result.next()){
                listModel.addElement(result.getString(2));
            }
            
            tlist.setModel(listModel);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tlist = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        tname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tyear = new javax.swing.JLabel();
        thost = new javax.swing.JLabel();
        tsponser = new javax.swing.JLabel();
        twin = new javax.swing.JLabel();
        tman = new javax.swing.JLabel();
        maxrungetter = new javax.swing.JLabel();
        maxwickettaker = new javax.swing.JLabel();
        maxrun = new javax.swing.JLabel();
        thirun2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        maxwicket = new javax.swing.JLabel();
        thighwicket2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tteams = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tlist.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(tlist);

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tname.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Year:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Host:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Sponsor:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Winner:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Man of the Tournament:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Highest Run:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Highest Wicket:");

        tyear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tyear.setText("jLabel9");

        thost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thost.setText("jLabel10");

        tsponser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tsponser.setText("jLabel11");

        twin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        twin.setText("jLabel12");

        tman.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tman.setText("jLabel13");

        maxrungetter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxrungetter.setText("jLabel14");

        maxwickettaker.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxwickettaker.setText("jLabel15");

        maxrun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxrun.setText("(Individual)");

        thirun2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thirun2.setText("jLabel16");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("(Total)");

        maxwicket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxwicket.setText("(Individual)");

        thighwicket2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thighwicket2.setText("jLabel19");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("(Total)");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Participated in Tournament:");

        tteams.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tteams.setText("jLabel22");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cricproject/icons8-Home-64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(480, 480, 480)
                                .addComponent(tname))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel21))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maxwickettaker)
                                    .addComponent(maxrungetter)
                                    .addComponent(tman)
                                    .addComponent(twin)
                                    .addComponent(tsponser)
                                    .addComponent(thost)
                                    .addComponent(tyear)
                                    .addComponent(tteams))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maxrun)
                                    .addComponent(maxwicket))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(thirun2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel17))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(thighwicket2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel20)))))))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tname)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tyear))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(thost))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tsponser))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(twin))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tman))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(maxrungetter)
                            .addComponent(maxrun)
                            .addComponent(thirun2)
                            .addComponent(jLabel17))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(maxwickettaker)
                            .addComponent(maxwicket)
                            .addComponent(thighwicket2)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(tteams))))
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        String tName = tlist.getSelectedValue();
        String tid = null;
        String year = null;
        String host = null;         
        String winner = null;
        String wteam = null;
        String mot = null;
        String motname = null;
        String sponsor = null;
        String highestrun1  = null;
        String highestrun2  = null;
        String wickettaker1  = null;
        String wickettaker2  = null;
        String teams = " ";
        String col_name = "tour_name";
        
        
        tableName = "tournament";
        
        ResultSet result = ob1.showAllDataQuery(tableName, col_name, tName, 1);
        
        while(result.next()){
            year = result.getString(3);
            host = result.getString(4);
            winner = result.getString(6);
            mot = result.getString(7);
            sponsor = result.getString(5);
            tid = result.getString(1);
        }
        
        
        tname.setText(tName);
        tyear.setText(year);
        thost.setText(host);
        tsponser.setText(sponsor);
        thost.setText(host);
        
        
        ResultSet result1 = ob1.showList("select t_name from team where t_id = '"+winner+"';");
       while(result1.next()){
            wteam = result1.getString(1);
        }
        
        twin.setText(wteam);
        
        ResultSet result2 = ob1.showList("select p_name from player where p_id = '"+mot+"';");
       while(result2.next()){
            motname = result2.getString(1);
        }
        
        tman.setText(motname);
        
        
        ResultSet result3 = ob1.showList("select t_name from team where t_id in (select t_id from tournament_teams where tour_id = '"+tid+"');");
            
        while(result3.next()){
            teams = teams + result3.getString(1) + "  ";
        }
           
        tteams.setText(teams);
         
        ResultSet result4 = ob1.showList("SELECT p.p_name, sum(b.runs) FROM batting_card AS b INNER JOIN player AS p ON p.p_id = b.p_id INNER JOIN matches AS m ON m.m_id = b.m_id INNER JOIN tournament AS t ON t.tour_id = m.tour_id WHERE t.tour_id = '1' group by p.p_name order by sum(b.runs) DESC LIMIT 1");
        
        while(result4.next()){
            highestrun2 = result4.getString(2);
            highestrun1 = result4.getString(1);
        }
                   
        maxrun.setText(highestrun2);
        maxrungetter.setText(highestrun1);
        
        ResultSet result5 = ob1.showList("SELECT p.p_name, sum(b.wickets) FROM bowling_card AS b INNER JOIN player AS p ON p.p_id = b.p_id INNER JOIN matches AS m ON m.m_id = b.m_id INNER JOIN tournament AS t ON t.tour_id = m.tour_id WHERE t.tour_id = '1' group by p.p_name order by sum(b.wickets) DESC LIMIT 1");

        while(result5.next()){
            wickettaker2 = result5.getString(2);
            wickettaker1 = result5.getString(1);
        }
                   
        maxwicket.setText(wickettaker2);
        maxwickettaker.setText(wickettaker1);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(tourinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tourinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tourinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tourinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tourinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maxrun;
    private javax.swing.JLabel maxrungetter;
    private javax.swing.JLabel maxwicket;
    private javax.swing.JLabel maxwickettaker;
    private javax.swing.JLabel thighwicket2;
    private javax.swing.JLabel thirun2;
    private javax.swing.JLabel thost;
    private javax.swing.JList<String> tlist;
    private javax.swing.JLabel tman;
    private javax.swing.JLabel tname;
    private javax.swing.JLabel tsponser;
    private javax.swing.JLabel tteams;
    private javax.swing.JLabel twin;
    private javax.swing.JLabel tyear;
    // End of variables declaration//GEN-END:variables
}
