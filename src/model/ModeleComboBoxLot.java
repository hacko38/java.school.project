/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Lot;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import managerBDD.GestionLots;
import managerBDD.GestionPiece;

/**
 *
 * @author BOUGHANMI
 */
public class ModeleComboBoxLot implements ComboBoxModel<Lot> {

    private Lot selectionne = null;

    private ArrayList<Lot> liste;

    public ModeleComboBoxLot() {
      
        liste = managerBDD.GestionLots.listeLots();  
       
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectionne = (Lot) anItem;

    }

   // @Override
    public Lot getSelectedItem() {

        return selectionne;
    }

   @Override
    public int getSize() {
        return liste.size();
    }

    @Override
    public Lot getElementAt(int index) {
      
        return liste.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }

    public void refreshModel() 
    {
        liste = managerBDD.GestionLots.listeLots();
        this.setSelectedItem(null);
    }
   

}
