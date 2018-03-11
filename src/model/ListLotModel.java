/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Lot;
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

    public ListLotModel(String modele) {
        //sinon, juste le modele selectionné
            listLot = ManagerCo.lotsSelect(modele);
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
