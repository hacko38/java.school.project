/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Stock;
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
        Object s;
        Stock st = listStock.get(rowIndex);

        switch (columnIndex) {
            case 0:
                s = st.getModel();
                break;
            case 1:
                s = st.getCategory();
                break;
            case 2:
                s = st.getQteStock();
                break;
            case 3:
                s = st.getSeuilMin();
                break;
            case 4:
                s = st.getDerniereCommande();
                break;
            default:
                s = "";
        }
        return s;
    }

    public Stock getElementAt(int index) {
        return listStock.get(index);
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return nomcolonne.get(column);
    }
    
    public void refreshmodel(){
        listStock = ManagerCo.getStock();
        nomcolonne = ManagerCo.getStockColonne();
        this.fireTableDataChanged();
    }

    

    
    

}
