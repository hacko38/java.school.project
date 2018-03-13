/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import model.TableStockModel;

/**
 *
 * @author Hakim
 */
public class MAGASINIER extends javax.swing.JFrame {

    /**
     * Creates new form RESP_ATELIER
     */
    public MAGASINIER() {
        initComponents();
        this.setLocation(200, 200);

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
        tabCtrlStock = new javax.swing.JTable();
        labMagasin = new javax.swing.JLabel();
        butReceptStock = new javax.swing.JButton();
        labError = new javax.swing.JLabel();
        butSortieStock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabCtrlStock.setModel(new TableStockModel());
        tabCtrlStock.getTableHeader().setResizingAllowed(false);
        tabCtrlStock.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabCtrlStock);

        labMagasin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labMagasin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labMagasin.setText("Magasin");

        butReceptStock.setText("RECEPTION STOCK");
        butReceptStock.setToolTipText("Lancer une demande d'approvisionnement");
        butReceptStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butReceptStockActionPerformed(evt);
            }
        });

        labError.setForeground(new java.awt.Color(255, 51, 51));
        labError.setText("  ");

        butSortieStock.setText("SORTIE STOCK");
        butSortieStock.setToolTipText("Lancer une demande d'approvisionnement");
        butSortieStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSortieStockActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(butReceptStock, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(butSortieStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labError, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 277, Short.MAX_VALUE))))
                    .addComponent(labMagasin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labMagasin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labError)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butReceptStock, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butSortieStock, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butReceptStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butReceptStockActionPerformed
        //On set le label error à "" 
        this.labError.setText("");
        //Si aucune ligne n'est selectionnée
        if (this.tabCtrlStock.getSelectedRow() != -1) {
            //On recupère le modele de la tabCtrlStock casté.
            TableStockModel model = (TableStockModel) tabCtrlStock.getModel();

            //On ouvre la frame entréestock
            //Pour lui faire passer l'objet Stock en paramètre, on utilise la methode getElementAt du modele qui nous renvoie un Stock.
            //getElementAt prend en paramètre un index. Ici, l'index est la getSelectedRow
            InShopFrame isf = null;
            try {
                isf = new InShopFrame(model.getElementAt(tabCtrlStock.getSelectedRow()));

                //On abonne l'écouteur de cette frame a la fermeture de la frame inshopFrame
                isf.abonner(new EcouteurWindows());
                isf.setVisible(true);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            //Sinon on set le label erreur
            this.labError.setText("Veuillez selectionner une ligne");
        }
    }//GEN-LAST:event_butReceptStockActionPerformed

    private void butSortieStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSortieStockActionPerformed
        //On set le label error à "" 
        this.labError.setText("");
        //Si aucune ligne n'est selectionnée
        if (this.tabCtrlStock.getSelectedRow() != -1) {
            //On recupère le modele de la tabCtrlStock casté.
            TableStockModel model = (TableStockModel) tabCtrlStock.getModel();

            //On ouvre la frame sortieStock
            //Pour lui faire passer l'objet Stock en paramètre, on utilise la methode getElementAt du modele qui nous renvoie un Stock.
            //getElementAt prend en paramètre un index. Ici, l'index est la getSelectedRow
            OutShopFrame osf = null;
            try {
                osf = new OutShopFrame(model.getElementAt(tabCtrlStock.getSelectedRow()));

                //On abonne l'écouteur de cette frame a la fermeture de la frame outshopFrame
                osf.abonner(new EcouteurWindows());
                osf.setVisible(true);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            //Sinon on set le label erreur
            this.labError.setText("Veuillez selectionner une ligne");
        }
    
    }//GEN-LAST:event_butSortieStockActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butReceptStock;
    private javax.swing.JButton butSortieStock;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labError;
    private javax.swing.JLabel labMagasin;
    private javax.swing.JTable tabCtrlStock;
    // End of variables declaration//GEN-END:variables

    //Ecouteur de fenetre qui rafraichit la jtable
    class EcouteurWindows extends WindowAdapter {

    @Override
    public void windowClosed(WindowEvent e) {
        //La fermeture de la sous fenetre entraine une mise à jour du modele de tableau
        TableStockModel model = (TableStockModel) tabCtrlStock.getModel();
        model.refreshmodel();
        model.fireTableDataChanged();
    }

}

}