/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Presse;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import managerBDD.ManagerPresse;
import views.RESP_PRODUCTION;

/**
 *
 * @author meunier
 */
public class TablePresseModel extends AbstractTableModel{
  

    ArrayList<Presse> listePresse = ManagerPresse.touteslespressesdispos();
    ArrayList<String> nomcolonnes = ManagerPresse.titrescolonnes();
    
    
    @Override
    public int getRowCount() {
       return listePresse.size();
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
        Presse p = listePresse.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                s = p.getNumPresse();
                break;
          default:
                s =  p.isEtatPresse();         
        }
        return s;       
    }
     @Override
    public boolean isCellEditable(int row, int column) { 
    // Aucune cellule éditable 
    return false;
}
    

    public void refreshmodel() {
       listePresse = ManagerPresse.touteslespressesdispos();
       nomcolonnes = ManagerPresse.titrescolonnes();
       this.fireTableDataChanged();
    }
    
}
