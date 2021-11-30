
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Reg extends javax.swing.JFrame {
    String CreateSql = null;
   
    public Reg() {
        initComponents();
       password.setBackground(new Color(0 , 0 , 0,64));
       username.setBackground(new Color(0 , 0 , 0,64));
       password.setOpaque(false);
       username.setOpaque(false);
    }
    
    public boolean register(String username,String password){
         try {

        PreparedStatement st = Setting.c.prepareStatement("SELECT * FROM public.users WHERE username = ?");
        st.setString(1, username);
        st.execute();
        ResultSet r1=st.executeQuery();
        if(r1.next()){
            JOptionPane.showMessageDialog(null, "The username is already in use please enter a different username");
            return false;
        }
        st = Setting.c.prepareStatement("SELECT COUNT(*) FROM public.users");
        r1=st.executeQuery();
        r1.next();
        int id = r1.getInt(1)+2;
        PreparedStatement stmt = Setting.c.prepareStatement("INSERT INTO users(id, username, password) VALUES(?, ?, ?)");
        stmt.setInt(1, id);
        stmt.setString(2, username);
        stmt.setString(3, password);
        stmt.executeUpdate();
        Setting.user.setusername(username);

     } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
         return true;
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        Register = new javax.swing.JButton();
        Username = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jButton2.setText("jButton2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("              REGISTRATION");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(130, 40, 290, 94);

        Password.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Password.setText("PASSWORD");
        jPanel2.add(Password);
        Password.setBounds(20, 260, 110, 30);

        password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel2.add(password);
        password.setBounds(240, 260, 290, 40);

        Register.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Register.setText("REGISTER");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel2.add(Register);
        Register.setBounds(150, 360, 125, 50);

        Username.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username.setText("USERNAME");
        jPanel2.add(Username);
        Username.setBounds(20, 190, 130, 30);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(70, 280, 0, 0);

        username.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel2.add(username);
        username.setBounds(240, 180, 290, 40);

        Login.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel2.add(Login);
        Login.setBounds(320, 360, 120, 50);

        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setText("label1");
        label1.setVisible(false);
        jPanel2.add(label1);
        label1.setBounds(590, 130, 34, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sathwik\\Downloads\\Screenshot 2021-11-29 at 3.34.18 PM.png")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, -30, 800, 800);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed

        String Username_text =  username.getText(), Password_text = password.getText();
        if(("".equals(Password_text)) || ("".equals(Username_text)))
        {
            System.out.println();
            JOptionPane.showMessageDialog(null, "Please enter all the fields");
        }
        else
        {
            if(register(Username_text, Password_text)){
            dispose();
            E_magazine e=new E_magazine();
            e.setVisible(true);
            }
        }

    }//GEN-LAST:event_RegisterActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
    
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed

    }//GEN-LAST:event_passwordActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        dispose();
        new Login().setVisible(true);
        
//        new Login.setVisible(true);
    }//GEN-LAST:event_LoginActionPerformed

    public static void main(String args[]) {

               new Reg().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JLabel Password;
    private javax.swing.JButton Register;
    private javax.swing.JLabel Username;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
