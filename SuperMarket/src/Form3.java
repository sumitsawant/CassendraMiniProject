import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class Form3 extends javax.swing.JFrame {

   
    public Form3() {
    	getContentPane().setBackground(Color.DARK_GRAY);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setForeground(Color.LIGHT_GRAY);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setForeground(Color.LIGHT_GRAY);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(Color.LIGHT_GRAY);
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton1.setForeground(Color.BLUE);
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setForeground(Color.LIGHT_GRAY);
        jButton2 = new javax.swing.JButton();
        jButton2.setForeground(Color.BLUE);
        jButton3 = new javax.swing.JButton();
        jButton3.setForeground(Color.BLUE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new Font("Agency FB", Font.PLAIN, 22)); // NOI18N
        jLabel1.setText("Update Item No");

        jLabel4.setText("Price");
        jLabel4.setName(""); // NOI18N

        jLabel5.setText("Manufacturer");
        jLabel5.setName(""); // NOI18N

        jLabel2.setText("Item No");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jButton3)
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(layout.createSequentialGroup()
        						.addGap(100)
        						.addComponent(jLabel1))
        					.addGroup(layout.createSequentialGroup()
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
        							.addComponent(jLabel3)
        							.addComponent(jLabel2))
        						.addGap(32)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jTextField3)
        								.addComponent(jTextField4)
        								.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)))
        						.addGap(40)
        						.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jButton3)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(20)
        					.addComponent(jLabel1)))
        			.addGap(31)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jButton1)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(jLabel2)))
        			.addGap(31)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
        			.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        //Query
        //String query = "CREATE KEYSPACE tp3 WITH replication "
        //  + "= {'class':'SimpleStrategy', 'replication_factor':1};";

        //creating Cluster object
        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();

        //Creating Session object
        Session session = cluster.connect();
        session.execute("USE super");

        //Executing the query
        // session.execute(query);
        int it_no, price;
        String name, man_fact;

        it_no = Integer.parseInt(jTextField1.getText());

        String cql = "SELECT * FROM sma WHERE it_no = "+it_no;

        //Getting the ResultSet
        ResultSet result = session.execute(cql);
        Row r =  result.all().get(0);
        jTextField2.setText(r.getString("name"));
        jTextField3.setText(new String("" +r.getInt("price")));
        jTextField4.setText(r.getString("man_fact"));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //creating Cluster object
      Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
    
      //Creating Session object
      Session session = cluster.connect();
      session.execute("USE super");
      
      //Executing the query
     // session.execute(query);
     int it_no, price;
     String name, man_fact;
     
     it_no = Integer.parseInt(jTextField1.getText());
     name = jTextField2.getText();
     price = Integer.parseInt(jTextField3.getText());
     man_fact = jTextField4.getText();
     
     String cql = "UPDATE sma SET name = '"+name+"', price="+price+" , man_fact = '"+man_fact+"' WHERE it_no="+it_no;
     System.out.println(cql);
     session.execute(cql);
     
      String message = "Item No Updated !  Name : " + name;
        JOptionPane.showMessageDialog(new JFrame(), message, "Done!",
        JOptionPane.INFORMATION_MESSAGE);
    
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
            java.util.logging.Logger.getLogger(Form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form3().setVisible(true);
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
