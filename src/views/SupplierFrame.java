/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import entities.Lot;
import entities.Stock;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.xml.bind.Marshaller;
import managerBDD.ManagerCo;

/**
 *
 * @author DJENADI
 */
public class SupplierFrame extends javax.swing.JFrame {

    private Stock stock;
    public SupplierFrame(Stock st) throws Exception {
        initComponents();
        if (st == null)
            throw new Exception("Le stock ne peut être nul");
        else {
        this.stock = st;
        this.labObjModele.setText(st.getModel() + " - " + st.getCategory());
        this.labObjQte.setText(st.getQteStock() + " - seuil mini : " + st.getSeuilMin());
        this.labObjQteSouhait.setText("100");
        this.setLocation(250, 250);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sliCommande = new javax.swing.JSlider();
        butValider = new javax.swing.JButton();
        labModeleCmd = new javax.swing.JLabel();
        labQteDispo = new javax.swing.JLabel();
        labObjModele = new javax.swing.JLabel();
        labObjQte = new javax.swing.JLabel();
        labQteSouhaitee = new javax.swing.JLabel();
        labObjQteSouhait = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Choississez la quantité");

        sliCommande.setMajorTickSpacing(50);
        sliCommande.setMaximum(500);
        sliCommande.setMinorTickSpacing(10);
        sliCommande.setPaintLabels(true);
        sliCommande.setPaintTicks(true);
        sliCommande.setSnapToTicks(true);
        sliCommande.setValue(100);
        sliCommande.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliCommandeStateChanged(evt);
            }
        });

        butValider.setText("LANCER");
        butValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butValiderActionPerformed(evt);
            }
        });

        labModeleCmd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labModeleCmd.setText("Modèle à commander :");

        labQteDispo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labQteDispo.setText("Qté Disponible :");

        labObjModele.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labObjModele.setText("test");

        labObjQte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labObjQte.setText(" ");

        labQteSouhaitee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labQteSouhaitee.setText("Qté souhaitée :");

        labObjQteSouhait.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labObjQteSouhait.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labModeleCmd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labObjModele))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labQteDispo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labObjQte))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labQteSouhaitee)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labObjQteSouhait))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sliCommande, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(butValider, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labModeleCmd)
                    .addComponent(labObjModele))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labQteDispo)
                    .addComponent(labObjQte))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labQteSouhaitee)
                    .addComponent(labObjQteSouhait))
                .addGap(18, 18, 18)
                .addComponent(sliCommande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(butValider, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butValiderActionPerformed
        String s = ManagerCo.launchBatch(new Lot(0,this.stock.getModel(), this.sliCommande.getValue()));
        JOptionPane.showMessageDialog(this, s);
        this.dispose();
    }//GEN-LAST:event_butValiderActionPerformed

    private void sliCommandeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliCommandeStateChanged
    labObjQteSouhait.setText("" + ((JSlider)evt.getSource()).getValue());
    }//GEN-LAST:event_sliCommandeStateChanged

    //preocédure permettant d'abonner la fenetre RESP_ATELIER aux actions sur cette fenetre
    //ceci afin de rafraichir la fenetre stock après lancement d'un lot
    public void abonner(WindowAdapter wa){
        this.addWindowListener(wa);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butValider;
    private javax.swing.JLabel labModeleCmd;
    private javax.swing.JLabel labObjModele;
    private javax.swing.JLabel labObjQte;
    private javax.swing.JLabel labObjQteSouhait;
    private javax.swing.JLabel labQteDispo;
    private javax.swing.JLabel labQteSouhaitee;
    private javax.swing.JSlider sliCommande;
    // End of variables declaration//GEN-END:variables
}
