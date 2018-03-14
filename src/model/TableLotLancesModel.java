/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Lot;
import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;
import managerBDD.ManagerLot;
import static managerBDD.ManagerLot.titrescolonnes;

/**
 * TableModel qui permet la structuration de la table LOT de la Frame production
 *
 * @author quent
 */
public class TableLotLancesModel extends AbstractTableModel {

    ArrayList<Lot> listeLots = ManagerLot.touslesLotsLances();
    ArrayList<String> nomcolonnes = ManagerLot.titrescolonnes();

    @Override
    public int getRowCount() {
        return listeLots.size();
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
        Object s = null;
      
        {
        Lot l = listeLots.get(rowIndex);

        switch (columnIndex) {
            case 0:
                s = l.getIdLot();
                break;
            case 1:
                s = l.getModele();
                break;
            default:
                s = l.getNbPiecesDemandees();
        }
        }
        return s;
    }

    public void refreshmodel() {
     
        listeLots = ManagerLot.touslesLotsLances();
    nomcolonnes = ManagerLot.titrescolonnes();
    this.fireTableDataChanged();
    }
    
    @Override
    public boolean isCellEditable(int row, int column) { 
    // Aucune cellule éditable 
    return false;
}
}
