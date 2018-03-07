/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import managerBDD.ManagerCo;

/**
 *
 * @author Hakim
 */
public class TableStockModel extends AbstractTableModel {
    ArrayList<Stock> listStock = ManagerCo.getStock();
    ArrayList<String> nomcolonne = ManagerCo.getStockColonne();

    @Override
    public int getRowCount() {
        return listStock.size();
    }

    @Override
    public int getColumnCount() {
        return nomcolonne.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
