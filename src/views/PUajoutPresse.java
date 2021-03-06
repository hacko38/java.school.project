/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JOptionPane;
import managerBDD.ManagerPresse;
import model.ListPresseModel;
import tools.Tools;

/**
 *
 * @author quent
 */
public class PUajoutPresse extends javax.swing.JFrame {

    /**
     * Creates new form POPUPconfirmationAjoutPresse
     */
    public PUajoutPresse() {
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

        jLabel1 = new javax.swing.JLabel();
        txtNumPresse = new javax.swing.JTextField();
        labAjouter = new javax.swing.JLabel();
        butOui = new javax.swing.JButton();
        butNon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nouvelle Presse n°");

        txtNumPresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumPresseActionPerformed(evt);
            }
        });

        labAjouter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labAjouter.setText("AJOUTER PRESSE ?");

        butOui.setText("OUI");
        butOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOuiActionPerformed(evt);
            }
        });

        butNon.setText("NON");
        butNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumPresse, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(butOui, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(butNon, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(labAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumPresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butOui, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butNon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumPresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumPresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumPresseActionPerformed

    private void butOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butOuiActionPerformed
       
        
        
        if( Tools.estEntier(txtNumPresse.getText()) && Integer.parseInt(txtNumPresse.getText())>0 && Integer.parseInt(txtNumPresse.getText())>999)
        {
            int numPresse = Integer.parseInt(txtNumPresse.getText());
            JOptionPane.showMessageDialog(this, ManagerPresse.ajoutPresse(numPresse));          
            ListPresseModel model = (ListPresseModel) PanelMachine.listPresse.getModel();
            model.refreshmodel();
            
            this.dispose();
        }
        else
        {
          JOptionPane.showMessageDialog(this, "Veuillez entrer un numéro de Presse correct !");  
        }
           
        
    }//GEN-LAST:event_butOuiActionPerformed

    private void butNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNonActionPerformed
     this.setVisible(false);
    }//GEN-LAST:event_butNonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butNon;
    private javax.swing.JButton butOui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labAjouter;
    private javax.swing.JTextField txtNumPresse;
    // End of variables declaration//GEN-END:variables
}
