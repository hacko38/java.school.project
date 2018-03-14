/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renderer;

import entities.Lot;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author BOUGHANMI
 */
public class RenduComboBoxLot implements ListCellRenderer<Lot>
{
    


    @Override
    public Component getListCellRendererComponent(JList<? extends Lot > list, Lot lot, int index, boolean isSelected, boolean cellHasFocus) 
    { 
        JLabel l;
        if (lot == null)
        {   
          l = new JLabel ("Selectionnez un lot :");
        }  
        else
         {  
         l = new JLabel ( Integer.toString(lot.getIdLot() ) );
         
         }
        l.setOpaque(true);
      
       if (index % 2 == 0)
       {
           l.setBackground(Color.LIGHT_GRAY);
       }
       else
       {
           l.setBackground(Color.WHITE);
       }
     
       return l;
    }
}
