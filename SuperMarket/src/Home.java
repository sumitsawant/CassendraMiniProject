import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;
public class Home extends javax.swing.JFrame {

public Home() {
	getContentPane().setFont(new Font("Agency FB", Font.PLAIN, 11));
	getContentPane().setBackground(Color.DARK_GRAY);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setForeground(SystemColor.activeCaption);
        jButton1 = new javax.swing.JButton();
        jButton1.setForeground(Color.DARK_GRAY);
        jButton2 = new javax.swing.JButton();
        jButton2.setForeground(Color.DARK_GRAY);
        jButton3 = new javax.swing.JButton();
        jButton3.setForeground(Color.RED);
        jButton4 = new javax.swing.JButton();
        jButton4.setForeground(Color.DARK_GRAY);
        jButton5 = new javax.swing.JButton();
        jButton5.setForeground(Color.DARK_GRAY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new Font("Agency FB", Font.BOLD, 40)); // NOI18N
        jLabel1.setText("Super Market");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Add Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Modify Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Delete Item No");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("View Item Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("View Clusters");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(211, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
        					.addGap(79)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
        								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
        								.addGap(47))
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
        								.addGap(305))))
        					.addGap(47))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
        					.addGap(213))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
        			.addGap(29)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
        			.addGap(70)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE, false)
        				.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
        			.addGap(68)
        			.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
        			.addGap(97))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Form3 ob = new Form3();
        
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Form1 ob = new Form1();
        
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Form2 ob = new Form2();
        
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Form4 ob = new Form4();
        
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Kmeans ob = new Kmeans();
        
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
