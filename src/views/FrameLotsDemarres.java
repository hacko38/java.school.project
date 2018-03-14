/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import managerBDD.ManagerLot;
import model.TableLotsDemarresModel;
import tools.Tools;

/**
 *
 * @author quent
 */
public class FrameLotsDemarres extends javax.swing.JFrame {

    /**
     * Creates new form FrameLotsDemarres
     */
    public FrameLotsDemarres() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabLotDemarre = new javax.swing.JTable();
        butLiberer = new javax.swing.JButton();
        labTitre = new javax.swing.JLabel();
        butActualiser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabLotDemarre.setModel(new TableLotsDemarresModel()
        );
        jScrollPane1.setViewportView(tabLotDemarre);

        butLiberer.setText("LIBERER PRESSE");
        butLiberer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLibererActionPerformed(evt);
            }
        });

        labTitre.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitre.setText("Production-Lots Démarrés");

        butActualiser.setText("ACTUALISER");
        butActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butActualiserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butLiberer, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butActualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
            .addComponent(labTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitre)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butLiberer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butActualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static JTable getTabLotDemarre() {
        return tabLotDemarre;
    }

    public void abonner(WindowAdapter wa) {
        this.addWindowListener(wa);

    }

    private void butLibererActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLibererActionPerformed

        if (tabLotDemarre.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Veuillez selectionner une presse ");
        } else if (tabLotDemarre.getSelectedRowCount() == 1) {

            PUliberer popupLiberer = new PUliberer();
            popupLiberer.setVisible(true);
            popupLiberer.abonner(new EcouteurWindows());
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez ne selectionner qu'une seule presse à libérer");
        }


    }//GEN-LAST:event_butLibererActionPerformed

    private void butActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butActualiserActionPerformed

        TableLotsDemarresModel model = (TableLotsDemarresModel) tabLotDemarre.getModel();
        model.refreshmodel();
    }//GEN-LAST:event_butActualiserActionPerformed
    class EcouteurWindows extends WindowAdapter {

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("test");
            TableLotsDemarresModel model = (TableLotsDemarresModel) tabLotDemarre.getModel();
            model.refreshmodel();
            model.fireTableDataChanged();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butActualiser;
    private javax.swing.JButton butLiberer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labTitre;
    private static javax.swing.JTable tabLotDemarre;
    // End of variables declaration//GEN-END:variables
}
