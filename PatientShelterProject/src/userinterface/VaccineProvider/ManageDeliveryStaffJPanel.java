/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.VaccineProvider;

import Business.City.City;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.DeliveryManagerRole;
import Business.Role.Role;
import Business.Role.PharmacyStaffRole;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;
import java.awt.Component;

/**
 *
 * @author Nishigandha
 */
public class ManageDeliveryStaffJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryManagerJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    public ManageDeliveryStaffJPanel(JPanel userProcessContainer,City city,UserAccount userAccount,Organization organization,Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.userAccount=userAccount;
        this.city=city;
        this.organization=organization;
        this.enterprise=enterprise;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryManagerVM = new javax.swing.JTable();
        lblManageAdmin = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        txtPasswordVM = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsernameVM = new javax.swing.JTextField();
        txtNameVM = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDeliveryManagerVM.setBackground(new java.awt.Color(214, 229, 244));
        tblDeliveryManagerVM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Staff ID", "Name", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblDeliveryManagerVM);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 988, 183));

        lblManageAdmin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblManageAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageAdmin.setText("MANAGE DELIEVERY STAFF");
        add(lblManageAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 610, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPassword.setText("Password:");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, -1, -1));

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Add Delivery Staff");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, -1, -1));

        txtPasswordVM.setBackground(new java.awt.Color(214, 229, 244));
        add(txtPasswordVM, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, 212, -1));

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, -1, -1));

        txtUsernameVM.setBackground(new java.awt.Color(214, 229, 244));
        add(txtUsernameVM, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 212, -1));

        txtNameVM.setBackground(new java.awt.Color(214, 229, 244));
        add(txtNameVM, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 212, -1));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 430, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/icons8-delivery-48.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 160, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/5.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        Employee employee = enterprise.getEmployeeDirectory().createEmp(txtNameVM.getText());
        String userName = txtUsernameVM.getText();
        String password = txtPasswordVM.getText();
        String pass = txtPasswordVM.getText();
boolean flag2;
        flag2 = pass.matches("^((?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[@$!%*#?&]).{1,20})$");

        if(!flag2) {
            JOptionPane.showMessageDialog(null, "Password should contain 1 uppercase letter, lowercase letter, number, and special character.");
            return;
        }
        if (enterprise.getUserAccountDirectory().authenticateUser(userName, password) != null) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                    return;
        }

        else if (userName.equals("") || password.equals("")) {
               JOptionPane.showMessageDialog(null, "Username and password can not be empty");
                    return;
        }
        else{
        Role role = new DeliveryManagerRole();
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                     
       populateTable();
       JOptionPane.showMessageDialog(this,"Delivery Manager Created");
        }
        txtNameVM.setText(" ");
        txtUsernameVM.setText(" ");
        txtPasswordVM.setText(" ");
//        txtStaffID.setText(" ");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VaccineProviderAdminJPanel manageOrderjp = (VaccineProviderAdminJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageAdmin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblDeliveryManagerVM;
    private javax.swing.JTextField txtNameVM;
    private javax.swing.JTextField txtPasswordVM;
    private javax.swing.JTextField txtUsernameVM;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDeliveryManagerVM.getModel();
        dtm.setRowCount(0);

            
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if("Business.Role.DeliveryManagerRole".equals(userAccount.getRole().getClass().getName())){
                    System.out.println(userAccount.getRole());
                    Object[] row = new Object[4];
                    row[0] = userAccount;
                    row[1] = userAccount.getEmployee().getId();
                    row[2] = userAccount.getEmployee().getEmpName();
                    row[3] = userAccount.getPassword();

                    dtm.addRow(row);
                }
                }

    }
}