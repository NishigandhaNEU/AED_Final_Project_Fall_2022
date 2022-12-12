/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Hospital;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.VitalSigns.VitalSigns;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nishigandha
 */
public class ManageVitalSignsReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageVitalSignsReportJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    Patient p;
    public ManageVitalSignsReportJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearchH1 = new javax.swing.JButton();
        txtOxyLevel = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        txtBP1 = new javax.swing.JTextField();
        txtTemp1 = new javax.swing.JTextField();
        lblTemp1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSigns1 = new javax.swing.JTable();
        lblManageManufacturer = new javax.swing.JLabel();
        btnCreateH1 = new javax.swing.JButton();
        lblOxy1 = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        lblBP1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblAddPat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearchH1.setBackground(new java.awt.Color(0, 0, 0));
        btnSearchH1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearchH1.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchH1.setText("Search");
        btnSearchH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchH1ActionPerformed(evt);
            }
        });
        add(btnSearchH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, -1, -1));

        txtOxyLevel.setBackground(new java.awt.Color(214, 229, 244));
        add(txtOxyLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 212, -1));

        txtSearch.setBackground(new java.awt.Color(214, 229, 244));
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 220, -1));

        txtBP1.setBackground(new java.awt.Color(214, 229, 244));
        add(txtBP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 212, -1));

        txtTemp1.setBackground(new java.awt.Color(214, 229, 244));
        add(txtTemp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 212, -1));

        lblTemp1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTemp1.setText("Temperature:");
        add(lblTemp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, -1, -1));

        tblVitalSigns1.setBackground(new java.awt.Color(214, 229, 244));
        tblVitalSigns1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Blood Pressure", "Temperature", "SP02 Level", "Date"
            }
        ));
        jScrollPane1.setViewportView(tblVitalSigns1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 910, 183));

        lblManageManufacturer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblManageManufacturer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageManufacturer.setText("MANAGE VITAL SIGN FOR PATIENT");
        add(lblManageManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 650, -1));

        btnCreateH1.setBackground(new java.awt.Color(0, 0, 0));
        btnCreateH1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCreateH1.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateH1.setText("Add Vital Sign");
        btnCreateH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateH1ActionPerformed(evt);
            }
        });
        add(btnCreateH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, -1, -1));

        lblOxy1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblOxy1.setText("Oxygen Level");
        add(lblOxy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, -1, -1));

        lblBloodPressure.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBloodPressure.setText("Patient Name:");
        add(lblBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        lblBP1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBP1.setText("Blood Pressure:");
        add(lblBP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, -1, -1));

        lblAddPat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/icons-male-user.png"))); // NOI18N
        add(lblAddPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/4.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateH1ActionPerformed
        try{
        int SPO2 = Integer.parseInt(txtOxyLevel.getText());
        int BloodPressure = Integer.parseInt(txtBP1.getText());
        double temperature = Double.parseDouble(txtTemp1.getText());
        VitalSigns vs;
        System.out.println(p.getVitalHistory());
        vs=p.getVitalHistory().addVitalDir(BloodPressure, temperature, SPO2);
        populateTable();
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(this,"Invalid Input");
        }
    }//GEN-LAST:event_btnCreateH1ActionPerformed

    private void btnSearchH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchH1ActionPerformed
       try{
        String patientName = txtSearch.getText();
        for(City c : system.getCityList()){
             
           for(Enterprise e : c.getEnterpriseDirectory().getEnterpriseArrayList()){
               //Hospital hos = (Hospital)e;
               if(e.getClass().getName().equals("Business.Enterprise.Hospital")){
                   Hospital hos = (Hospital)e;
                   //System.out.println(e);
                    for(Patient patient: hos.getPatientDirectory().getPatientDir()){
                        if(patient.getPersonName().equals(patientName)){
                            p=patient;
                        }
//                        else{
//                            JOptionPane.showMessageDialog(null, "Patient not found", "Warning", JOptionPane.WARNING_MESSAGE);
//                        }
                    }
               }
           }
        }
        JOptionPane.showMessageDialog(this, "Patient found you can proceed");
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this,"Patient not found");
       }
    }//GEN-LAST:event_btnSearchH1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HospitalStaffJPanel sysAdminwjp = (HospitalStaffJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateH1;
    private javax.swing.JButton btnSearchH1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddPat;
    private javax.swing.JLabel lblBP1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblManageManufacturer;
    private javax.swing.JLabel lblOxy1;
    private javax.swing.JLabel lblTemp1;
    private javax.swing.JTable tblVitalSigns1;
    private javax.swing.JTextField txtBP1;
    private javax.swing.JTextField txtOxyLevel;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTemp1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblVitalSigns1.getModel();
        dtm.setRowCount(0);
                
                    for (VitalSigns v : p.getVitalHistory().getVitalDir()) {
                    
                    Object[] row = new Object[5];
                    row[0] = p.getPersonName();
                    row[1] = v.getBloodPressure();
                    row[2] = v.getTemperature();
                    row[3] = v.getTemperature();
                    row[4] = v.getDate();

                    dtm.addRow(row);
                } //To change body of generated methods, choose Tools | Templates.
    }
}
