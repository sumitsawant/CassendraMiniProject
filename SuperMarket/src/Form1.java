import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
public class Form1 extends javax.swing.JFrame {

	public Form1() {
		getContentPane().setForeground(Color.LIGHT_GRAY);
		getContentPane().setBackground(Color.DARK_GRAY);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton1.setBackground(Color.WHITE);
        jButton1.setForeground(Color.BLUE);
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(Color.LIGHT_GRAY);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(Color.LIGHT_GRAY);
        jLabel2.setBackground(Color.DARK_GRAY);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setForeground(Color.LIGHT_GRAY);
        jLabel3.setBackground(Color.DARK_GRAY);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setForeground(Color.LIGHT_GRAY);
        jButton2 = new javax.swing.JButton();
        jButton2.setForeground(Color.BLUE);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setForeground(SystemColor.textHighlight);
        jButton3 = new javax.swing.JButton();
        jButton3.setBackground(Color.WHITE);
        jButton3.setForeground(Color.BLUE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.setName("btnAdd"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setName("txtRoll"); // NOI18N

        jTextField2.setName("txtMarks"); // NOI18N

        jTextField3.setName("txtCity"); // NOI18N

        jTextField4.setName("txtName"); // NOI18N

        jLabel1.setText("Item No");

        jLabel2.setText("Name");

        jLabel3.setText("Price");

        jLabel4.setText("Manufacturer");

        jButton2.setText("Reset");
        jButton2.setName("btnReset"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new Font("Agency FB", Font.BOLD, 22)); // NOI18N
        jLabel5.setText("Add Product Name");

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jButton3)
        						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
        					.addGap(5)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        							.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
        							.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jTextField2)
        						.addComponent(jTextField4)
        						.addComponent(jTextField1)
        						.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(64)
        					.addComponent(jLabel5)))
        			.addContainerGap(529, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(22)
        					.addComponent(jLabel5))
        				.addComponent(jButton3))
        			.addGap(28)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
        					.addGap(22))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(32)
        					.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(13)))
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
        			.addGap(23))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           
                    
      //creating Cluster object
      Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
    
      //Creating Session object
      Session session = cluster.connect();
      //Query
  	session.execute("CREATE KEYSPACE IF NOT EXISTS super WITH replication " + "= {'class':'SimpleStrategy','replication_factor':1}; ");
      
      session.execute("USE super");
      
      //Executing the query
     // session.execute(query);
     int it_no,price;
     String name,man_fact;
     
     it_no = Integer.parseInt(jTextField1.getText());
     name = jTextField2.getText();
     price= Integer.parseInt(jTextField3.getText());
     man_fact= jTextField4.getText();
     
     session.execute("CREATE TABLE IF NOT EXISTS sma (it_no int PRIMARY KEY, name text,price int,man_fact text);");
     
     
     String cql = "INSERT INTO sma (it_no, name,price,man_fact) VALUES( "+it_no+" , '"+name+"' , "+price+", '"+man_fact+"')";
        ResultSet results =  session.execute(cql);
     
  //      if (results == null)
    //    {
            String message = "Item Added !!!  Name : " + name;
            JOptionPane.showMessageDialog(new JFrame(), message, "Done!",
            JOptionPane.INFORMATION_MESSAGE);
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
      //  }
       // else
        //{
          //  String message = "Roll Number already present !!!";
          //  JOptionPane.showMessageDialog(new JFrame(), message, "Duplicate ROll Number !",
           // JOptionPane.ERROR_MESSAGE);
            
       // }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Home ob = new Home();

        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
