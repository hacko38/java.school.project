/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerBDD;


import connection.Connexion;
import entities.Lot;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author BOUGHANMI
 */
public class GestionLots 
{

    public static ArrayList<Lot> listeLots() {
        ArrayList<Lot> liste = new ArrayList<>();
        Connexion co = null;
        
        try 
        {
          co = Connexion.getInstance();
          if (co != null) 
          {

            Connection c = co.getConnection();
          

            java.sql.Statement st = c.createStatement();
            ResultSet resultat = st.executeQuery("SELECT* FROM VueLotsAControler");

            while (resultat.next()) 
            {   
                liste.add(new Lot(resultat.getInt(1), resultat.getString(2) , resultat.getString(3)));              
            }
            st.close();
         }
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        
        return liste;

    }

    public static String finLot(int idLot) 
    {
        String message = null ;
        Connexion co = null;
       
        try 
        {
            
             co = Connexion.getInstance();
             if (co != null)
             {
                 Connection c = co.getConnection();
                 CallableStatement cs = c.prepareCall("{? = call ArretLot(?,?)}");
                 cs.registerOutParameter(1, java.sql.Types.INTEGER);
                 cs.setInt(2,idLot);
                 cs.registerOutParameter(3, java.sql.Types.VARCHAR,100);
                 cs.execute();
                 message = cs.getString(3);
                      
                 cs.close();
             }

        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
            System.out.println(message);
        return message ;

    }

 

}
