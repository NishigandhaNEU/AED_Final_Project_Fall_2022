/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Nishigandha
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    City city;
    Organization organization;
    Enterprise enterprise;

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization,
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.city = city;
        this.organization = organization;
        populateTree();

    }
        
    
    public void populateTree(){
        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
        ArrayList<City> networkList=system.getCityList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;

        City city;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;

        int i = 0;
        for(City node : system.getCityList()){
            networkNode = new DefaultMutableTreeNode(node.getName());
            networks.insert(networkNode, i);
            i++;
            int j = 0;
            for(Enterprise e : node.getEnterpriseDirectory().getEnterpriseArrayList()){
                enterpriseNode = new DefaultMutableTreeNode(e.getName());
                networkNode.insert(enterpriseNode, j);
                j++;
                int k = 0;
                for(Organization o : e.getOrganizationDirectory().getOrganizationArrayList()){
                    organizationNode = new DefaultMutableTreeNode(o.getName());
                    enterpriseNode.insert(organizationNode, k);
                    k++;
                }
            }
        }
        model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageCitySys = new javax.swing.JButton();
        btnManageEnterpriseSys = new javax.swing.JButton();
        btnCovidSys = new javax.swing.JButton();
        btnManageEnterpriseAdminsSys = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        btnManagePerson1Sys = new javax.swing.JButton();
        lblAddPat = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageCitySys.setBackground(new java.awt.Color(0, 0, 0));
        btnManageCitySys.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageCitySys.setForeground(new java.awt.Color(255, 255, 255));
        btnManageCitySys.setText("Manage City");
        btnManageCitySys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCitySysActionPerformed(evt);
            }
        });
        add(btnManageCitySys, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 253, 190, 30));

        btnManageEnterpriseSys.setBackground(new java.awt.Color(0, 0, 0));
        btnManageEnterpriseSys.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageEnterpriseSys.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEnterpriseSys.setText("Manage Enterprises");
        btnManageEnterpriseSys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseSysActionPerformed(evt);
            }
        });
        add(btnManageEnterpriseSys, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 190, 30));

        btnCovidSys.setBackground(new java.awt.Color(0, 0, 0));
        btnCovidSys.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCovidSys.setForeground(new java.awt.Color(255, 255, 255));
        btnCovidSys.setText("Covid Cases Chart");
        btnCovidSys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCovidSysActionPerformed(evt);
            }
        });
        add(btnCovidSys, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 190, 30));

        btnManageEnterpriseAdminsSys.setBackground(new java.awt.Color(0, 0, 0));
        btnManageEnterpriseAdminsSys.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageEnterpriseAdminsSys.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEnterpriseAdminsSys.setText("Manage Enterprise Admin");
        btnManageEnterpriseAdminsSys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdminsSysActionPerformed(evt);
            }
        });
        add(btnManageEnterpriseAdminsSys, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SYSTEM ADMIN HOMEPAGE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 900, -1));

        jTree.setBackground(new java.awt.Color(229, 255, 242));
        jTree.setForeground(new java.awt.Color(0, 0, 0));
        jTree.setMinimumSize(new java.awt.Dimension(0, 860));
        jScrollPane1.setViewportView(jTree);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 860));

        btnManagePerson1Sys.setBackground(new java.awt.Color(0, 0, 0));
        btnManagePerson1Sys.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManagePerson1Sys.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePerson1Sys.setText("Manage Person");
        btnManagePerson1Sys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePerson1SysActionPerformed(evt);
            }
        });
        add(btnManagePerson1Sys, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 190, 30));

        lblAddPat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/icons-male-user.png"))); // NOI18N
        add(lblAddPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 50, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/5.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void createChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        ArrayList<Person> personList = system.getPersonDirectory().getPersonList();
// System.out.println(personList);
        int positive = 0;
        int negative = 0;

        for (Person person1 : personList) {
//System.out.println(p.getTestHistory().getTestReportList());
            if (person1.getTestHistory().getTestReportList().size() != 0) {
                if (person1.getTestHistory().getTestReportList().get(0).isResult() == true) {
                    ++positive;
                }
                if (person1.getTestHistory().getTestReportList().get(0).isResult() == false) {
                    ++negative;
                }
//System.out.println(positive);
//System.out.println(negative);
            }
        }
        if (negative == 0 && positive == 0) {
            JOptionPane.showMessageDialog(this, "No Data Found", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            dataset.setValue("Positive", positive);
            dataset.setValue("Negative", negative);

            JFreeChart chart = ChartFactory.createPieChart3D(
                    "Covid Cases in City", // chart title
                    dataset, // data
                    true, // include legend
                    true,
                    false);
            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(270);
            plot.setForegroundAlpha(0.60f);
            plot.setInteriorGap(0.02);
            int width = 640;
            /* Width of the image */
            int height = 480;
            /* Height of the image */


            ChartFrame chartFrame = new ChartFrame("Chart", chart);
            chartFrame.setVisible(true);
            chartFrame.setSize(500, 500);
        }
    }

    private void btnCovidSysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCovidSysActionPerformed
        createChart();

    }//GEN-LAST:event_btnCovidSysActionPerformed

    private void btnManageEnterpriseSysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseSysActionPerformed
       ManageEnterprisesJPanel manageTestCenterJPanel = new ManageEnterprisesJPanel(userProcessContainer, system);
        userProcessContainer.add("manageTestCenterJPanel", manageTestCenterJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseSysActionPerformed

    private void btnManageCitySysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCitySysActionPerformed
      
    }//GEN-LAST:event_btnManageCitySysActionPerformed

    private void btnManageEnterpriseAdminsSysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdminsSysActionPerformed
       
    }//GEN-LAST:event_btnManageEnterpriseAdminsSysActionPerformed

    private void btnManagePerson1SysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePerson1SysActionPerformed
        // TODO add your handling code here:
      

    }//GEN-LAST:event_btnManagePerson1SysActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCovidSys;
    private javax.swing.JButton btnManageCitySys;
    private javax.swing.JButton btnManageEnterpriseAdminsSys;
    private javax.swing.JButton btnManageEnterpriseSys;
    private javax.swing.JButton btnManagePerson1Sys;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblAddPat;
    // End of variables declaration//GEN-END:variables
}
