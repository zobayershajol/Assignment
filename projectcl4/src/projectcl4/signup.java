/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcl4;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dorpon
 */
public class signup extends javax.swing.JFrame {

    public signup() {
        initComponents();
        ButtonGroup obj=new ButtonGroup();
        obj.add(tv_male);
        obj.add(tv_female);
    } 

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tv_country = new javax.swing.JComboBox<>();
        tv_name = new javax.swing.JTextField();
        tv_lname = new javax.swing.JTextField();
        tv_Email = new javax.swing.JTextField();
        tv_Pass = new javax.swing.JPasswordField();
        tv_male = new javax.swing.JRadioButton();
        tv_female = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        tv_birth = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tv_showinfo = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("          SIGNUP");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Email");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Sex");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Country");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("SIGNUP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tv_country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    Afghanistan", "    Albania", "    Algeria", "    Andorra", "    Angola", "    Antigua and Barbuda", "    Argentina", "    Armenia", "    Aruba", "    Australia", "    Austria", "    Azerbaijan", "    ", " ", "    Bahamas, The", "    Bahrain", "    Bangladesh", "    Barbados", "    Belarus", "    Belgium", "    Belize", "    Benin", "    Bhutan", "    Bolivia", "    Bosnia and Herzegovina", "    Botswana", "    Brazil", "    Brunei", "    Bulgaria", "    Burkina Faso", "    Burma", "    Burundi", "    ", " ", "    Cambodia", "    Cameroon", "    Canada", "    Cape Verde", "    Central African Republic", "    Chad", "    Chile", "    China", "    Colombia", "    Comoros", "    Congo, Democratic Republic of the", "    Congo, Republic of the", "    Costa Rica", "    Cote d'Ivoire", "    Croatia", "    Cuba", "    Curacao", "    Cyprus", "    Czech Republic", "    Denmark", "    Djibouti", "    Dominica", "    Dominican Republic", "    Ecuador", "    Egypt", "    El Salvador", "    Equatorial Guinea", "    Eritrea", "    Estonia", "    Ethiopia", "    Fiji", "    Finland", "    France", "    Gabon", "    Gambia", "    Georgia", "    Germany", "    Ghana", "    Greece", "    Grenada", "    Guatemala", "    Guinea", "    Guinea-Bissau", "    Guyana", "    Haiti", "    Holy See", "    Honduras", "    Hong Kong", "    Hungary", "    Iceland", "    India", "    Indonesia", "    Iran", "    Iraq", "    Ireland", "    Israel", "    Italy", "    J amaica", "    Japan", "    Jordan", "    Kazakhstan", "    Kenya", "    Kiribati", "    Korea, North", "    Korea, South", "    Kosovo", "    Kuwait", "    Kyrgyzstan", "    Laos", "    Latvia", "    Lebanon", "    Lesotho", "    Liberia", "    Libya", "    Liechtenstein", "    Lithuania", "    Luxembourg  ", "    Macau", "    Macedonia", "    Madagascar", "    Malawi", "    Malaysia", "    Maldives", "    Mali", "    Malta", "    Marshall Islands", "    Mauritania", "    Mauritius", "    Mexico", "    Micronesia", "    Moldova", "    Monaco", "    Mongolia", "    Montenegro", "    Morocco", "    Mozambique", "    Namibia", "    Nauru", "    Nepal", "    Netherlands", "    Netherlands Antilles", "    New Zealand", "    Nicaragua", "    Niger", "    Nigeria", "    North Korea", "    Norway", "    Oman", "    Pakistan", "    Palau", "    Palestinian Territories", "    Panama", "    Papua New Guinea", "    Paraguay", "    Peru", "    Philippines", "    Poland", "    Portugal", "    Qatar", "    Romania", "    Russia", "    Rwanda", "    Saint Kitts and Nevis", "    Saint Lucia", "    Saint Vincent and the Grenadines", "    Samoa", "    San Marino", "    Sao Tome and Principe", "    Saudi Arabia", "    Senegal", "    Serbia", "    Seychelles", "    Sierra Leone", "    Singapore", "    Sint Maarten", "    Slovakia", "    Slovenia", "    Solomon Islands", "    Somalia", "    South Africa", "    South Korea", "    South Sudan", "    Spain", "    Sri Lanka", "    Sudan", "    Suriname", "    Swaziland", "    Sweden", "    Switzerland", "    Syria    ", "    Taiwan", "    Tajikistan", "    Tanzania", "    Thailand", "    Timor-Leste", "    Togo", "    Tonga", "    Trinidad and Tobago", "    Tunisia", "    Turkey", "    Turkmenistan", "    Tuvalu", "    Uganda", "    Ukraine", "    United Arab Emirates", "    United Kingdom", "    Uruguay", "    Uzbekistan", "    Vanuatu", "    Venezuela", "    Vietnam", "    Yemen", "    Zambia", "    Zimbabwe", " ", " " }));

        tv_male.setText("Male");

        tv_female.setText("Female");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Birthday");

        tv_showinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Email", "Password", "Sex", "Birthday", "Country"
            }
        ));
        tv_showinfo.setToolTipText("");
        jScrollPane2.setViewportView(tv_showinfo);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tv_lname)
                    .addComponent(tv_name)
                    .addComponent(tv_Email)
                    .addComponent(tv_Pass)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tv_birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tv_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tv_male)
                                .addGap(18, 18, 18)
                                .addComponent(tv_female))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton2)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tv_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tv_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tv_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tv_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tv_male)
                    .addComponent(tv_female))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(tv_birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tv_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1231, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3))
                        .addGap(40, 40, 40)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String userName;
    String password;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model=(DefaultTableModel) tv_showinfo.getModel();
      //  !tv_Email.getText().trim().equals("")=tvEmail;
        if(!tv_Email.getText().trim().equals("")&& !tv_Pass.getText().trim().equals("")&&tv_male.isSelected())
        {
             model.addRow(new Object[]{tv_name.getText(),tv_lname.getText(),tv_Email.getText(),
                tv_Pass.getText(),tv_male.getText(),tv_birth.getDate(),tv_country.getSelectedItem()});
             JOptionPane.showMessageDialog(null, "noerror","display",JOptionPane.INFORMATION_MESSAGE);
             
           

        }
        
        
        else if(!tv_Email.getText().trim().equals("")&& !tv_Pass.getText().trim().equals("")&&tv_female.isSelected())
        {
             model.addRow(new Object[]{tv_name.getText(),tv_lname.getText(),tv_Email.getText(),
                tv_Pass.getText(),tv_female.getText(),tv_birth.getDate(),tv_country.getSelectedItem()});
             JOptionPane.showMessageDialog(null, "noerror","display",JOptionPane.INFORMATION_MESSAGE);
             
        }
        
        else 
         {
            JOptionPane.showMessageDialog(null, "error","display",JOptionPane.INFORMATION_MESSAGE); 
            
         }
        userName=tv_Email.getText();
        password=tv_Pass.getText();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       login ob=new login(userName,password);
       this.setVisible(false);
       ob.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField tv_Email;
    private javax.swing.JPasswordField tv_Pass;
    private com.toedter.calendar.JDateChooser tv_birth;
    private javax.swing.JComboBox<String> tv_country;
    private javax.swing.JRadioButton tv_female;
    private javax.swing.JTextField tv_lname;
    private javax.swing.JRadioButton tv_male;
    private javax.swing.JTextField tv_name;
    private javax.swing.JTable tv_showinfo;
    // End of variables declaration//GEN-END:variables
}
