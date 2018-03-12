/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Lot;
import entities.Stock;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import managerBDD.ManagerCo;

/**
 *
 * @author DJENADI
 */
public class ListLotModel extends AbstractListModel<Lot> {

    ArrayList<Lot> listLot;

    public ListLotModel() {
        //si pas de modele, affichage de tous les lots
        listLot = ManagerCo.tousLots();
    }

    public ListLotModel(Stock st) {
        //sinon, juste le modele selectionné
            listLot = ManagerCo.lotsSelect(st.getModel());
    }
    
    public void refreshmodel(Lot l){
        int i;
        listLot = ManagerCo.tousLots();
        i = listLot.indexOf(l);
        this.fireIntervalRemoved(this, i+1, i+1);
    }

    @Override
    public int getSize() {
        return listLot.size();
    }

    @Override
    public Lot getElementAt(int index) {
        return listLot.get(index);
    }
    
    

}
