/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rms;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leemon
 */
public class WholeInformation extends javax.swing.JFrame {

    /**
     * Creates new form WholeInformation
     */
    public WholeInformation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        showInfo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        showInfoTable = new javax.swing.JTable();
        notFoundLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 1000));

        searchButton.setBackground(new java.awt.Color(0, 204, 51));
        searchButton.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Table No", "Phone No", "Total", "Item No", "Date&Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(searchTable);
        if (searchTable.getColumnModel().getColumnCount() > 0) {
            searchTable.getColumnModel().getColumn(0).setResizable(false);
            searchTable.getColumnModel().getColumn(1).setResizable(false);
            searchTable.getColumnModel().getColumn(2).setResizable(false);
            searchTable.getColumnModel().getColumn(3).setResizable(false);
            searchTable.getColumnModel().getColumn(4).setResizable(false);
            searchTable.getColumnModel().getColumn(5).setResizable(false);
        }

        showInfo.setBackground(new java.awt.Color(0, 204, 51));
        showInfo.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        showInfo.setText("Show All Info");
        showInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showInfoMouseClicked(evt);
            }
        });
        showInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showInfoActionPerformed(evt);
            }
        });

        showInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Table No", "Phone No", "Total", "Item No", "Date&Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(showInfoTable);
        if (showInfoTable.getColumnModel().getColumnCount() > 0) {
            showInfoTable.getColumnModel().getColumn(0).setResizable(false);
            showInfoTable.getColumnModel().getColumn(1).setResizable(false);
            showInfoTable.getColumnModel().getColumn(2).setResizable(false);
            showInfoTable.getColumnModel().getColumn(3).setResizable(false);
            showInfoTable.getColumnModel().getColumn(4).setResizable(false);
            showInfoTable.getColumnModel().getColumn(5).setResizable(false);
        }

        notFoundLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        notFoundLabel.setForeground(new java.awt.Color(255, 0, 0));

        backButton.setBackground(new java.awt.Color(51, 204, 0));
        backButton.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(showInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notFoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(searchTextField)
                    .addComponent(showInfo)
                    .addComponent(backButton))
                .addGap(297, 297, 297)
                .addComponent(notFoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(328, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchButton.setBackground(Color.red);
        DefaultTableModel model = (DefaultTableModel) searchTable.getModel();
       try
       {
           BufferedReader wr= new BufferedReader(new FileReader("customer.txt"));
           String s;
           int flag=0;
           while((s=wr.readLine())!=null)
           {
               String []xl=s.split(",");
               if( xl[2].equals(searchTextField.getText()))
               {
                   notFoundLabel.setText("Found");
                   flag=1;
                    model.addRow(new Object []{xl[0],xl[1],xl[2],xl[3],xl[4],xl[5]});
               }
               else
               {
                    if ( flag!=1)
                    {
                        notFoundLabel.setText("Not Found");
                    }
               }
                 
           }
       }
       catch(Exception w)
       {
       }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void showInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInfoActionPerformed
      showInfo.setBackground(Color.red);
        DefaultTableModel model = (DefaultTableModel) showInfoTable.getModel();
       try
       {
           BufferedReader wr= new BufferedReader(new FileReader("customer.txt"));
           String s;
           while((s=wr.readLine())!=null)
           {
               String []xl=s.split(",");
                model.addRow(new Object []{xl[0],xl[1],xl[2],xl[3],xl[4],xl[5]});
                 
           }
       }
       catch(Exception w)
       {
       }
      
    }//GEN-LAST:event_showInfoActionPerformed

    private void showInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showInfoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_showInfoMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        Stuff s= new Stuff();
        s.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel notFoundLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable searchTable;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton showInfo;
    private javax.swing.JTable showInfoTable;
    // End of variables declaration//GEN-END:variables
}
