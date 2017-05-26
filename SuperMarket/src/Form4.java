
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;

public class Form4 extends javax.swing.JFrame {

    public Form4() {
    	getContentPane().setBackground(Color.DARK_GRAY);
    	getContentPane().setForeground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(SystemColor.textHighlight);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(Color.LIGHT_GRAY);
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton1.setBackground(Color.RED);
        jButton1.setForeground(Color.DARK_GRAY);
        jButton1.setText("DELETE");
        jButton2 = new javax.swing.JButton();
        jButton2.setForeground(Color.BLUE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new Font("Agency FB", Font.PLAIN, 22)); // NOI18N
        jLabel1.setText("Delete Item");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Item No");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(null); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addGap(20)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jButton2)
        							.addGroup(layout.createSequentialGroup()
        								.addGap(54)
        								.addComponent(jLabel1))))
        					.addGap(37)
        					.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jButton2)
        			.addGap(18)
        			.addComponent(jLabel1)
        			.addGap(79)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addGap(28)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(48, Short.MAX_VALUE))
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

        String cql = "SELECT * FROM sma WHERE it_no = " + it_no;
        session.execute(cql);
        
        ResultSet result = session.execute(cql);
        Row r =  result.all().get(0);
        name =  r.getString("name");
        
        cql = "DELETE FROM sma WHERE it_no = " + it_no;
        session.execute(cql);
        
        String message = "Item No Deleted !  Name : " + name;
        JOptionPane.showMessageDialog(new JFrame(), message, "Done!",
        JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Home ob = new Home();

        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }//GEN-LAST:event_formWindowActivated


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
