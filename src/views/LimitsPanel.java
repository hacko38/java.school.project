/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import entities.Stock;
import javax.swing.JOptionPane;
import managerBDD.ManagerCo;
import model.TableStockModel;
import tools.Tools;

/**
 *
 * @author DJENADI
 */
public class LimitsPanel extends javax.swing.JPanel {

    /**
     * Creates new form LimitsPanel
     */
    public LimitsPanel() {
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
        tabCtrlStock = new javax.swing.JTable();
        labGestionSeuil = new javax.swing.JLabel();
        labError = new javax.swing.JLabel();
        panModifSeuils = new javax.swing.JPanel();
        labModel = new javax.swing.JLabel();
        labCategorie = new javax.swing.JLabel();
        labSeuilActuel = new javax.swing.JLabel();
        labEtiqModel = new javax.swing.JLabel();
        labEtiqCateg = new javax.swing.JLabel();
        labEtiqSeuil = new javax.swing.JLabel();
        tfNvSeuil = new javax.swing.JTextField();
        butValidModif = new javax.swing.JButton();
        labEtiqNvSeuil = new javax.swing.JLabel();
        labTitModif = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        tabCtrlStock.setModel(new TableStockModel()
        );
        tabCtrlStock.getTableHeader().setResizingAllowed(false);
        tabCtrlStock.getTableHeader().setReorderingAllowed(false);
        tabCtrlStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabCtrlStockMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabCtrlStock);

        labGestionSeuil.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labGestionSeuil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labGestionSeuil.setText("Gestion des Seuils");

        labError.setForeground(new java.awt.Color(255, 51, 51));
        labError.setText("  ");

        panModifSeuils.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labModel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labModel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labModel.setText("-");

        labCategorie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labCategorie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCategorie.setText("-");

        labSeuilActuel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labSeuilActuel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labSeuilActuel.setText("-");

        labEtiqModel.setForeground(new java.awt.Color(102, 102, 102));
        labEtiqModel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labEtiqModel.setText("Modèle");

        labEtiqCateg.setForeground(new java.awt.Color(102, 102, 102));
        labEtiqCateg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labEtiqCateg.setText("Categorie");

        labEtiqSeuil.setForeground(new java.awt.Color(102, 102, 102));
        labEtiqSeuil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labEtiqSeuil.setText("Seuil Actuel");

        tfNvSeuil.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        butValidModif.setText("VALIDER");
        butValidModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butValidModifActionPerformed(evt);
            }
        });

        labEtiqNvSeuil.setForeground(new java.awt.Color(102, 102, 102));
        labEtiqNvSeuil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labEtiqNvSeuil.setText("Nouveau Seuil");

        labTitModif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labTitModif.setText("Modification du Seuil");

        javax.swing.GroupLayout panModifSeuilsLayout = new javax.swing.GroupLayout(panModifSeuils);
        panModifSeuils.setLayout(panModifSeuilsLayout);
        panModifSeuilsLayout.setHorizontalGroup(
            panModifSeuilsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panModifSeuilsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panModifSeuilsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(butValidModif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labModel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labCategorie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labSeuilActuel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labEtiqModel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labEtiqCateg, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(labEtiqSeuil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNvSeuil, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labEtiqNvSeuil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labTitModif, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        panModifSeuilsLayout.setVerticalGroup(
            panModifSeuilsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panModifSeuilsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitModif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labEtiqModel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labModel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labEtiqCateg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(labEtiqSeuil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labSeuilActuel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labEtiqNvSeuil)
                .addGap(5, 5, 5)
                .addComponent(tfNvSeuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butValidModif, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labGestionSeuil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panModifSeuils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labGestionSeuil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labError)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panModifSeuils, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butValidModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butValidModifActionPerformed
        //On set le label error à ""
        this.labError.setText(" ");
        //On verifie que le txtfield nouveau seuil ne soit pas nul, alphabetique ou trop elevé
        try {
            if (Tools.isNull(this.tfNvSeuil.getText()) || !Tools.estEntier(this.tfNvSeuil.getText())|| Integer.parseInt(this.tfNvSeuil.getText())>100000) {
            this.labError.setText("Le nouveau seuil renseigné ne doit pas être null, alphabetiques ou supérieur à 100 000");
        } //Si une ligne est bien selectionnée
        else if (this.tabCtrlStock.getSelectedRow() != -1) {
            //On recupère le modele de la tabCtrlStock casté.
            TableStockModel model = (TableStockModel) tabCtrlStock.getModel();
            //on utilise la methode getElementAt du modele qui nous renvoie un Stock.
            //getElementAt prend en paramètre un index. Ici, l'index est la getSelectedRow
            Stock st = model.getElementAt(tabCtrlStock.getSelectedRow());

            //On reverifie que le modele selectionné correspond a celui dans le panel
            if (!st.getModel().equals(this.labModel.getText()) || !st.getCategory().equals(this.labCategorie.getText())) {
                this.labError.setText("Le modele diffère de la ligne selectionnée");
            } else {
                //on lance la procedure stockée et on stocke le msg retour dans s
                String s = ManagerCo.updateLimit(st, this.tfNvSeuil.getText());
                this.initPan();
                //On affiche le message retour
                JOptionPane.showMessageDialog(this, s, this.labGestionSeuil.getText(), 1);
                //On met à jour la table
                model.refreshmodel();
            }

        } else {
            //Sinon (si aucune ligne n'est selectionnée) on set le label erreur
            this.labError.setText("Veuillez selectionner une ligne");
        }
            
        } catch (NumberFormatException e) {
            this.labError.setText("Le montant de votre entier est trop important");
        }
        
    }//GEN-LAST:event_butValidModifActionPerformed

    private void tabCtrlStockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCtrlStockMouseReleased
        // Sur click dans la frame stock
        //On initialise la tf
        this.tfNvSeuil.setText("");
        this.labError.setText(" ");
        if (tabCtrlStock.getSelectedRow() != -1) {
            if (tabCtrlStock.getSelectedRowCount() == 1) {
                this.refreshPan();
            } else {
                //si plus d'1 ligne selectionnée
                this.initPan();
            }

        } else {
            this.initPan();
        }
    }//GEN-LAST:event_tabCtrlStockMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butValidModif;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labCategorie;
    private javax.swing.JLabel labError;
    private javax.swing.JLabel labEtiqCateg;
    private javax.swing.JLabel labEtiqModel;
    private javax.swing.JLabel labEtiqNvSeuil;
    private javax.swing.JLabel labEtiqSeuil;
    private javax.swing.JLabel labGestionSeuil;
    private javax.swing.JLabel labModel;
    private javax.swing.JLabel labSeuilActuel;
    private javax.swing.JLabel labTitModif;
    private javax.swing.JPanel panModifSeuils;
    private javax.swing.JTable tabCtrlStock;
    private javax.swing.JTextField tfNvSeuil;
    // End of variables declaration//GEN-END:variables

    private void refreshPan() {
        //On recupère le modele de la tabCtrlStock casté.
        TableStockModel model = (TableStockModel) tabCtrlStock.getModel();
        //on utilise la methode getElementAt du modele qui nous renvoie un Stock.
        //getElementAt prend en paramètre un index. Ici, l'index est la getSelectedRow
        Stock st = model.getElementAt(tabCtrlStock.getSelectedRow());
        //On recupère les valeurs de l'objet stock dans nos labels
        this.labModel.setText(st.getModel());
        this.labCategorie.setText(st.getCategory());
        this.labSeuilActuel.setText(Integer.toString(st.getSeuilMin()));
    }

    private void initPan() {
        //On remet les labels à -
        this.labModel.setText("-");
        this.labCategorie.setText("-");
        this.labSeuilActuel.setText("-");
        this.tfNvSeuil.setText("");
    }
}
