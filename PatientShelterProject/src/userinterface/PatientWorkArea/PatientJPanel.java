/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.PatientWorkArea;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Hospital;
import Business.Enterprise.Hospital;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Person.Person;
import Business.LabReport.LabReport;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Nishigandha
 */
public class PatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    public PatientJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
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

        lbltitle = new javax.swing.JLabel();
        lblVacState = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtVacStatus = new javax.swing.JTextField();
        txtCovReport = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        lblAddPat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("PATIENT ACCOUNT");
        add(lbltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 550, -1));

        lblVacState.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblVacState.setText("Here is your vaccination status:");
        add(lblVacState, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 210, 39));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Here is your covid test result:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 230, -1));

        txtVacStatus.setEditable(false);
        txtVacStatus.setBackground(new java.awt.Color(214, 229, 244));
        add(txtVacStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 149, -1));

        txtCovReport.setEditable(false);
        txtCovReport.setBackground(new java.awt.Color(214, 229, 244));
        add(txtCovReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 149, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Check Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, -1, -1));
        add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 361, 30));

        lblAddPat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/icons-male-user.png"))); // NOI18N
        add(lblAddPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/6.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        for(City c : system.getCityList()){
             
           for(Enterprise e : c.getEnterpriseDirectory().getEnterpriseArrayList()){
               //Hospital hos = (Hospital)e;
               if(e.getClass().getName().equals("Business.Enterprise.Hospital")){
                   Hospital hos = (Hospital)e;
                   //System.out.println(e);
                    for(Patient patient: hos.getPatientDirectory().getPatientDir()){
                        if(patient.getPersonName().equals(userAccount.getEmployee().getEmpName())){
                            txtVacStatus.setText(patient.getVacStatus());
                            //lblWelcome.setText("Welcome "+patient.getName()+" to Covid Care");
                        }
                    }
               }
           }
        }}
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Please get your vaccinated status");
        }
        String status=" ";
        try{
        for(Person p : system.getPersonDirectory().getPersonList()){
            if(p.getPersonName().equals(userAccount.getEmployee().getEmpName())){
                LabReport report = p.getTestHistory().getTestReportList().get(p.getTestHistory().getTestReportList().size()-1);
                if(report.isResult()==true){
                    status = "Covid Positive";
                }
                else{
                    status = "Covid Negative";
                }
                txtCovReport.setText(status);
            }
        }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(this,"Please get tested first");
    }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAddPat;
    private javax.swing.JLabel lblVacState;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextField txtCovReport;
    private javax.swing.JTextField txtVacStatus;
    // End of variables declaration//GEN-END:variables
}
