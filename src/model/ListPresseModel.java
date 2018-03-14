/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Lot;
import entities.Presse;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import managerBDD.ManagerLot;
import managerBDD.ManagerPresse;

/**ListModel associé à la base de données et au TableModel
 *
 * @author meunier
 */
public class ListPresseModel extends AbstractListModel<Presse> {

    private ArrayList<Presse> liste;

    public ListPresseModel() {
        liste = ManagerPresse.touteslespresses();
    }

    @Override
    public int getSize() {
        return liste.size();
    }

    

    @Override
    public Presse getElementAt(int index) {
        return liste.get(index);
    }
    
    public void refreshmodel()
    {
        liste = ManagerPresse.touteslespresses();        
       this.fireContentsChanged(this, 0, liste.size()-1);
    }
   

}
