/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rms;

import java.awt.Color;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
 

/**
 *
 * @author Leemon
 */
public class Customer extends javax.swing.JFrame {

   // public int countSerial;
    public double t;
    public Customer() {
        initComponents();
       
    }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        menuButton1 = new javax.swing.JToggleButton();
        menuButton2 = new javax.swing.JToggleButton();
        homeButton = new javax.swing.JButton();
        menuButton3 = new javax.swing.JToggleButton();
        menuButton4 = new javax.swing.JToggleButton();
        menuButton5 = new javax.swing.JToggleButton();
        homeLabel = new javax.swing.JLabel();
        menuButton6 = new javax.swing.JToggleButton();
        menuButton7 = new javax.swing.JToggleButton();
        menuButton8 = new javax.swing.JToggleButton();
        menuButton9 = new javax.swing.JToggleButton();
        menuLebel = new javax.swing.JLabel();
        totalPanel = new javax.swing.JPanel();
        customerName = new javax.swing.JLabel();
        customerPhoneTextField = new javax.swing.JTextField();
        customerTableTextField = new javax.swing.JTextField();
        totalBill = new javax.swing.JLabel();
        customerPhoneNo = new javax.swing.JLabel();
        customerNameTextField = new javax.swing.JTextField();
        orderSubmit = new javax.swing.JButton();
        customerName2 = new javax.swing.JLabel();
        totalTextLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 900));

        menuPanel.setBackground(new java.awt.Color(0, 0, 0));
        menuPanel.setLayout(null);

        menuButton1.setBackground(new java.awt.Color(0, 204, 0));
        menuButton1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        menuButton1.setText("Select");
        menuButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton1ActionPerformed(evt);
            }
        });
        menuPanel.add(menuButton1);
        menuButton1.setBounds(450, 450, 110, 34);

        menuButton2.setBackground(new java.awt.Color(0, 204, 0));
        menuButton2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        menuButton2.setText("Select");
        menuButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton2ActionPerformed(evt);
            }
        });
        menuPanel.add(menuButton2);
        menuButton2.setBounds(160, 10, 110, 34);

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rms/img/rounded_blue_home_button_4805.jpg"))); // NOI18N
        homeButton.setText(" ");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        menuPanel.add(homeButton);
        homeButton.setBounds(30, 50, 60, 60);

        menuButton3.setBackground(new java.awt.Color(0, 204, 0));
        menuButton3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        menuButton3.setText("Select");
        menuButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton3ActionPerformed(evt);
            }
        });
        menuPanel.add(menuButton3);
        menuButton3.setBounds(160, 80, 110, 34);

        menuButton4.setBackground(new java.awt.Color(0, 204, 0));
        menuButton4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        menuButton4.setText("Select");
        menuButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton4ActionPerformed(evt);
            }
        });
        menuPanel.add(menuButton4);
        menuButton4.setBounds(160, 200, 110, 34);

        menuButton5.setBackground(new java.awt.Color(0, 204, 0));
        menuButton5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        menuButton5.setText("Select");
        menuButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton5ActionPerformed(evt);
            }
        });
        menuPanel.add(menuButton5);
        menuButton5.setBounds(690, 40, 110, 34);

        homeLabel.setBackground(new java.awt.Color(0, 255, 255));
        homeLabel.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(0, 204, 0));
        homeLabel.setText("Home");
        menuPanel.add(homeLabel);
        homeLabel.setBounds(30, 20, 60, 24);

        menuButton6.setBackground(new java.awt.Color(0, 204, 0));
        menuButton6.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        menuButton6.setText("Select");
        menuButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton6ActionPerformed(evt);
            }
        });
        menuPanel.add(menuButton6);
        menuButton6.setBounds(690, 120, 110, 34);

        menuButton7.setBackground(new java.awt.Color(0, 204, 0));
        menuButton7.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        menuButton7.setText("Select");
        menuButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton7ActionPerformed(evt);
            }
        });
        menuPanel.add(menuButton7);
        menuButton7.setBounds(690, 210, 110, 34);

        menuButton8.setBackground(new java.awt.Color(0, 204, 0));
        menuButton8.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        menuButton8.setText("Select");
        menuButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton8ActionPerformed(evt);
            }
        });
        menuPanel.add(menuButton8);
        menuButton8.setBounds(450, 330, 110, 34);

        menuButton9.setBackground(new java.awt.Color(0, 204, 0));
        menuButton9.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        menuButton9.setText("Select");
        menuButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButton9ActionPerformed(evt);
            }
        });
        menuPanel.add(menuButton9);
        menuButton9.setBounds(450, 400, 110, 34);

        menuLebel.setBackground(new java.awt.Color(51, 255, 255));
        menuLebel.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        menuLebel.setForeground(new java.awt.Color(255, 0, 0));
        menuLebel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rms/img/Thin.jpg"))); // NOI18N
        menuLebel.setText(" ");
        menuPanel.add(menuLebel);
        menuLebel.setBounds(0, 0, 860, 530);

        totalPanel.setBackground(java.awt.Color.cyan);

        customerName.setBackground(new java.awt.Color(0, 204, 0));
        customerName.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        customerName.setForeground(new java.awt.Color(255, 0, 0));
        customerName.setText("Table No.");

        customerPhoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerPhoneTextFieldActionPerformed(evt);
            }
        });

        customerTableTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerTableTextFieldActionPerformed(evt);
            }
        });

        totalBill.setBackground(new java.awt.Color(0, 204, 0));
        totalBill.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        totalBill.setForeground(new java.awt.Color(255, 0, 0));
        totalBill.setText("Total Bill (+4%VAT)");

        customerPhoneNo.setBackground(new java.awt.Color(0, 204, 0));
        customerPhoneNo.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        customerPhoneNo.setForeground(new java.awt.Color(255, 0, 0));
        customerPhoneNo.setText("Cell Phone No.");

        customerNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameTextFieldActionPerformed(evt);
            }
        });

        orderSubmit.setBackground(new java.awt.Color(51, 255, 0));
        orderSubmit.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        orderSubmit.setForeground(new java.awt.Color(255, 0, 0));
        orderSubmit.setText("Submit");
        orderSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderSubmitActionPerformed(evt);
            }
        });

        customerName2.setBackground(new java.awt.Color(0, 204, 0));
        customerName2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        customerName2.setForeground(new java.awt.Color(255, 0, 0));
        customerName2.setText("Name");

        totalTextLabel.setBackground(new java.awt.Color(255, 0, 0));
        totalTextLabel.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        totalTextLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout totalPanelLayout = new javax.swing.GroupLayout(totalPanel);
        totalPanel.setLayout(totalPanelLayout);
        totalPanelLayout.setHorizontalGroup(
            totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(totalPanelLayout.createSequentialGroup()
                        .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(customerTableTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(totalPanelLayout.createSequentialGroup()
                            .addComponent(customerName2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(totalPanelLayout.createSequentialGroup()
                            .addComponent(customerPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(customerPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(totalPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderSubmit)
                        .addGap(136, 136, 136))
                    .addGroup(totalPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalBill)
                            .addComponent(totalTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(104, Short.MAX_VALUE))))
        );
        totalPanelLayout.setVerticalGroup(
            totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(totalPanelLayout.createSequentialGroup()
                        .addComponent(totalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(orderSubmit))
                    .addGroup(totalPanelLayout.createSequentialGroup()
                        .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerName2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerTableTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(totalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        menuPanel.add(totalPanel);
        totalPanel.setBounds(0, 530, 800, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int [] item = new int [10];
   
    private void menuButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton1ActionPerformed
         menuButton1.setBackground(Color.red);
            menuButton1.setText("Selected");
           
        t=t+79+(79*4/100);
         String c= String.valueOf(t);
        totalTextLabel.setText(c);
        item[8]=9;
    }//GEN-LAST:event_menuButton1ActionPerformed

    private void menuButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton2ActionPerformed
        menuButton2.setBackground(Color.red);
          menuButton2.setText("Selected");
        
        t=t+539+(539*4/100);
         String c= String.valueOf(t);
        totalTextLabel.setText(c);
        item[0]=1;

 
    }//GEN-LAST:event_menuButton2ActionPerformed

    private void menuButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton3ActionPerformed
      if ( menuButton3.isSelected())
      menuButton3.setBackground(Color.red);
          menuButton3.setText("Selected");
            t=t+539+(539*4/100);
         String c= String.valueOf(t);
        totalTextLabel.setText(c); 
        item[1]=2;
     
    }//GEN-LAST:event_menuButton3ActionPerformed

    private void menuButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton4ActionPerformed
          menuButton4.setBackground(Color.red);
          menuButton4.setText("Selected");
            t=t+619+(619*4/100);
         String c= String.valueOf(t);
        totalTextLabel.setText(c);
           item[2]=3;
    }//GEN-LAST:event_menuButton4ActionPerformed

    private void menuButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton5ActionPerformed
        menuButton5.setBackground(Color.red);
          menuButton5.setText("Selected");
            t=t+619+(619*4/100);
         String c= String.valueOf(t);
        totalTextLabel.setText(c);
        item[3]=4;
         
    }//GEN-LAST:event_menuButton5ActionPerformed

    private void menuButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton6ActionPerformed
          menuButton6.setBackground(Color.red);
          menuButton6.setText("Selected");
            t=t+669+(669*4/100);
         String c= String.valueOf(t);
        totalTextLabel.setText(c);
        item[4]=5;
          
    }//GEN-LAST:event_menuButton6ActionPerformed

    private void menuButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton7ActionPerformed
         menuButton7.setBackground(Color.red);
          menuButton7.setText("Selected");
            t=t+669+(669*4/100);
         String c= String.valueOf(t);
        totalTextLabel.setText(c);
        item[5]=6;
          
    }//GEN-LAST:event_menuButton7ActionPerformed

    private void menuButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton8ActionPerformed
          menuButton8.setBackground(Color.red);
          menuButton8.setText("Selected");
            t=t+129+(129*4/100);
         String c= String.valueOf(t);
        totalTextLabel.setText(c);
        item[6]=7;
          
    }//GEN-LAST:event_menuButton8ActionPerformed

    private void menuButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButton9ActionPerformed
          menuButton9.setBackground(Color.red);
          menuButton9.setText("Selected");
            t=t+159+(159*4/100);
         String c= String.valueOf(t);
        totalTextLabel.setText(c);
        item[7]=8;
          
    }//GEN-LAST:event_menuButton9ActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
         HomePage h= new HomePage();
         h.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void customerNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameTextFieldActionPerformed

    private void customerTableTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerTableTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerTableTextFieldActionPerformed

    private void customerPhoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerPhoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerPhoneTextFieldActionPerformed

    private void orderSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderSubmitActionPerformed
         int tableNo=Integer.parseInt( customerTableTextField.getText());
      if ( tableNo<=20) { 
        try
         {
             BufferedWriter wr = new BufferedWriter( new FileWriter("customer.txt",true));
             
             wr.write(customerNameTextField.getText());
             wr.write(",");
             wr.write(customerTableTextField.getText());
              wr.write(",");
              wr.write(customerPhoneTextField.getText());
               wr.write(",");
              String c= String.valueOf(t);
             wr.write(c);
             wr.write(",");
            // wr.write("Item No:"+" ");
             
             
             for( int i=0; i<9; i++)
             {
                  String s=String.valueOf(item[i]);
                  String x="0";
                  if (s.equals(x))
                  {
                      
                  }
                  else
                  {
                       wr.write(s);
                        wr.write(" ");
                  }
                 
             }
             wr.write(",");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
   LocalDateTime now = LocalDateTime.now();  
    String q= dtf.format(now);
   // wr.write("Date&Time"+" ");
    wr.write(q);
            
            wr.newLine();
             wr.close();
             
           
                BufferedWriter serial = new BufferedWriter( new FileWriter("serial.txt",true));
              serial.write(customerNameTextField.getText());
             serial.write(" ");
         
           // countSerial++;
              //String z=String.valueOf(countSerial);
           //   serial.write(z);
            // serial.write(" ");
             serial.write(q);
              serial.write(" ");
                 serial.write(customerTableTextField.getText());
              
             serial.newLine();
             serial.close();
            
              
                 BufferedWriter stuff = new BufferedWriter( new FileWriter("stuff.txt",true));
                  stuff.write(customerTableTextField.getText()+" ");
                  
                   for( int i=0;i<9;i++)
                   {
                       String e= String.valueOf(item[i]);
                       
                             stuff.write(e);
                             stuff.write(" ");
                      
                     
                   }
                   
              stuff.newLine();
              stuff.close();
              PopUpForSubmit f= new PopUpForSubmit();
              f.setVisible(true);
              this.setVisible(false);
              
             
             
         }
         catch(Exception e)
                 {
                     
                 }
      } 
      else 
      {
          PopUp n= new PopUp();
          n.setVisible(true);
      }
          
          
          
          
          
    }//GEN-LAST:event_orderSubmitActionPerformed
   
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customerName;
    private javax.swing.JLabel customerName2;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JLabel customerPhoneNo;
    private javax.swing.JTextField customerPhoneTextField;
    private javax.swing.JTextField customerTableTextField;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JToggleButton menuButton1;
    private javax.swing.JToggleButton menuButton2;
    private javax.swing.JToggleButton menuButton3;
    private javax.swing.JToggleButton menuButton4;
    private javax.swing.JToggleButton menuButton5;
    private javax.swing.JToggleButton menuButton6;
    private javax.swing.JToggleButton menuButton7;
    private javax.swing.JToggleButton menuButton8;
    private javax.swing.JToggleButton menuButton9;
    private javax.swing.JLabel menuLebel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton orderSubmit;
    private javax.swing.JLabel totalBill;
    private javax.swing.JPanel totalPanel;
    private javax.swing.JLabel totalTextLabel;
    // End of variables declaration//GEN-END:variables
}
