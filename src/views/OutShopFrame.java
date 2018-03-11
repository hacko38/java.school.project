/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import entities.Lot;
import entities.Stock;
import java.awt.event.WindowAdapter;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import managerBDD.ManagerCo;
import tools.Tools;

/**
 *
 * @author DJENADI
 */
public class OutShopFrame extends javax.swing.JFrame {

    private Stock stock;
    public OutShopFrame(Stock st) throws Exception {
        initComponents();
        if (st == null)
            throw new Exception("Le stock ne peut être nul");
        else {
        this.stock = st;
        this.labObjModele.setText(st.getModel() + " - " + st.getCategory());
        this.labObjQte.setText(st.getQteStock() + " - seuil mini : " + st.getSeuilMin());
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

        butMajStock = new javax.swing.JButton();
        labModeleSortie = new javax.swing.JLabel();
        labQteDispo = new javax.swing.JLabel();
        labObjModele = new javax.swing.JLabel();
        labObjQte = new javax.swing.JLabel();
        labQteRecue = new javax.swing.JLabel();
        txtRecepStock = new javax.swing.JTextField();
        labErrorQte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Choississez la quantité");

        butMajStock.setText("MAJ Stock");
        butMajStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMajStockActionPerformed(evt);
            }
        });

        labModeleSortie.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labModeleSortie.setText("Stock en sortie");

        labQteDispo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labQteDispo.setText("Qté Disponible :");

        labObjModele.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labObjModele.setText("test");

        labObjQte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labObjQte.setText(" ");

        labQteRecue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labQteRecue.setText("Qté Sortie :");

        txtRecepStock.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        labErrorQte.setForeground(new java.awt.Color(255, 51, 51));
        labErrorQte.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labModeleSortie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labObjModele))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labQteDispo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labObjQte))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labQteRecue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRecepStock, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(butMajStock, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addComponent(labErrorQte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labModeleSortie)
                    .addComponent(labObjModele))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labQteDispo)
                    .addComponent(labObjQte))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labQteRecue)
                    .addComponent(txtRecepStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(labErrorQte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butMajStock, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butMajStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMajStockActionPerformed
        //Si la qté n'est pas renseignée alors lbl pour renseigner
        this.labErrorQte.setText("");
        if (!Tools.isNull(txtRecepStock.getText())){
        String s = ManagerCo.sortieStock(this.stock,this.txtRecepStock.getText());
        JOptionPane.showMessageDialog(this, s);
        this.dispose();
        }
        else {
            this.labErrorQte.setText("Merci d'indiquer une quantité");
        }
    }//GEN-LAST:event_butMajStockActionPerformed

    //preocédure permettant d'abonner la fenetre RESP_ATELIER aux actions sur cette fenetre
    //ceci afin de rafraichir la fenetre stock après lancement d'un lot
    public void abonner(WindowAdapter wa){
        this.addWindowListener(wa);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butMajStock;
    private javax.swing.JLabel labErrorQte;
    private javax.swing.JLabel labModeleSortie;
    private javax.swing.JLabel labObjModele;
    private javax.swing.JLabel labObjQte;
    private javax.swing.JLabel labQteDispo;
    private javax.swing.JLabel labQteRecue;
    private javax.swing.JTextField txtRecepStock;
    // End of variables declaration//GEN-END:variables
}
