/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.City.City;
import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nishigandha
 */
public class ManageCityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public ManageCityJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;
        populateCityTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNewVaccinationCenter = new javax.swing.JLabel();
        lblCityName = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        btnAdd1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMCity = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNewVaccinationCenter.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblNewVaccinationCenter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewVaccinationCenter.setText("ADD CITY");
        add(lblNewVaccinationCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 580, -1));

        lblCityName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCityName.setText("City Name:");
        add(lblCityName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        txtCityName.setBackground(new java.awt.Color(214, 229, 244));
        add(txtCityName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 220, -1));

        btnAdd1.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd1.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd1.setText("Add City");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });
        add(btnAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, -1, -1));

        tblMCity.setBackground(new java.awt.Color(214, 229, 244));
        tblMCity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "City"
            }
        ));
        jScrollPane1.setViewportView(tblMCity);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 166, 660, 197));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/icons8-city-buildings-48.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/5.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
        String city1 = txtCityName.getText();
        if (txtCityName.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Blank city name", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        City city = ecosystem.createCity();
        city.setName(city1);
        
        populateCityTable();
        txtCityName.setText("");
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCityName;
    private javax.swing.JLabel lblNewVaccinationCenter;
    private javax.swing.JTable tblMCity;
    private javax.swing.JTextField txtCityName;
    // End of variables declaration//GEN-END:variables

    private void populateCityTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblMCity.getModel();
        dtm.setRowCount(0);
        
        for(City cityList: ecosystem.getCityList()){
            Object[] row = new Object[1];
            row[0] = cityList.getName();
            dtm.addRow(row);
        }
    }
}
