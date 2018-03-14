/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Piece;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import managerBDD.GestionPiece;

/**
 *
 * @author BOUGHANMI
 */
public class ModeleTableauPieces extends AbstractTableModel
{   
    ArrayList<Piece> listePieces = GestionPiece.recupererListePieces();
    ArrayList<String> listeNomsColonnes = GestionPiece.recupererNomsColonnes();

    @Override
    public int getRowCount() 
    {
        return listePieces.size();
    }

    @Override
    public int getColumnCount() 
    {
       return listeNomsColonnes.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        String s;
        Piece p = listePieces.get(rowIndex);
        
        switch (columnIndex)
        {
            case 0 : s = Integer.toString(p.getIdPiece());
            break;
            case 1 : s = Float.toString(p.getDiametreHL());
            break;
            case 2 : s = Float.toString(p.getDiametreHT());
            break;
            case 3 : s = Float.toString(p.getDiametreBL());
            break;
            case 4 : s = Float.toString(p.getDiametreBT());
            break;
            case 5 : s = p.getCategorie();
            break;
            case 6 : s = Integer.toString(p.getIdLot());
            break;
            default : s = p.getCommentaire();
            break;
  
        }
       
     return s;
    }
    
    public String getColumnName (int column)
    {
        return listeNomsColonnes.get(column);
    }

    public void refreshModel() 
    {
        listePieces = GestionPiece.recupererListePieces();
        listeNomsColonnes = GestionPiece.recupererNomsColonnes();
        this.fireTableDataChanged();
    }
}
