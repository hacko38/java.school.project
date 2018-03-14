/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Lot;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import managerBDD.ManagerLot;

/**
 *
 * @author quent
 */
public class TableLotsDemarresModel extends AbstractTableModel{

    ArrayList<Lot> listeLotsDemarres = ManagerLot.touslesLotsDemarres();
    ArrayList<String> nomcolonnes = ManagerLot.titrescolonnesdemarres();
    
    @Override
    public int getRowCount() {
       return listeLotsDemarres.size();
    }

    @Override
    public int getColumnCount() {
        return nomcolonnes.size();
    }
    @Override
    public String getColumnName(int column) {
        return nomcolonnes.get(column);
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Object s=null;
        Lot l = listeLotsDemarres.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                s = l.getIdLot();
                break;
            case 1:
                s =  l.getModele();
                break;
            case 2:
                s = l.getNbPiecesDemandees();
                break;
            default:
                s = l.getNumPresse();
        }
        return s;
    }
    @Override
    public boolean isCellEditable(int row, int column) { 
    // Aucune cellule éditable 
    return false;
} 

    public void refreshmodel() {
    listeLotsDemarres = ManagerLot.touslesLotsDemarres();
    nomcolonnes = ManagerLot.titrescolonnesdemarres();
    this.fireTableDataChanged();
    }
}
