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
public class ListLotModel extends AbstractListModel<Lot>{
    ArrayList<Lot>listLot = ManagerCo.tousLot();

    @Override
    public int getSize() {
        return listLot.size();
    }

    @Override
    public Lot getElementAt(int index) {
        return listLot.get(index);
    }
    
    
    
}
