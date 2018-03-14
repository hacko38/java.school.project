/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerBDD;

import connection.Connexion;
import entities.Piece;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;

/**
 *
 * @author BOUGHANMI
 */
public class GestionPiece 
{
   public static String ajouterPiece(Piece p)
   {         
        String message = null;
    
        Connexion co = null;
        
        try
        {
           co = Connexion.getInstance();
           if (co != null)
           {
               
                Connection c = co.getConnection();
                System.out.println("connecté");
                CallableStatement cs = c.prepareCall("{? = call Categorisation(?,?,?,?,?,?,?)}");
                cs.registerOutParameter(1, java.sql.Types.INTEGER);
                cs.setInt(2, p.getIdLot());
                cs.setFloat(3, p.getDiametreHL());
                cs.setFloat(4, p.getDiametreHT());
                cs.setFloat(5, p.getDiametreBL());
                cs.setFloat(6, p.getDiametreBT());
                cs.setString(7, p.getCommentaire());
                cs.registerOutParameter(8, java.sql.Types.VARCHAR,100);
                cs.execute();
                
                message = cs.getString(8);
                
                System.out.println(message);
                cs.close();
           }
           }           
           catch (SQLException e)
           {
                e.printStackTrace();          
           }
        
      return message;       
}
   public static ArrayList<Piece> recupererListePieces()
   {
       ArrayList<Piece> l = new ArrayList<>();
       Connexion co = null;
       
       try
       {
           co = Connexion.getInstance();
           if (co != null) 
           {
               Connection c = co.getConnection();
               
               java.sql.Statement st = c.createStatement();
               ResultSet r = st.executeQuery("SELECT* FROM VuePieces order by Id_Piece desc");
               
               while(r.next())
               {
                   l.add(new Piece(r.getInt(1), r.getFloat(2), r.getFloat(3), r.getFloat(4), r.getFloat(5), r.getString(6), r.getInt(7), r.getString(8)));
               }
               
               st.close();
           }
       }
       catch(SQLException e)
       {   
           e.printStackTrace();
       }
     return l;
   }
   
   public static ArrayList<String> recupererNomsColonnes()
   {
       ArrayList<String> l = new ArrayList<>();
       Connexion co = null;
       
       try
       {
           co = Connexion.getInstance();
           
           if (co != null) 
           {    
               Connection c = co.getConnection();
               Statement st = c.createStatement();
               ResultSet rs = st.executeQuery("SELECT* FROM VuePieces where Id_Piece = 0"); //0 pour éviter de charger toutes les informations (on veut juste avoir les colonnes)
               ResultSetMetaData rsmd = rs.getMetaData();
               
               for (int i = 1; i <= rsmd.getColumnCount(); i++ )
               {
                   l.add(rsmd.getColumnName(i));
               }               
           }    
       }
       catch(SQLException e)
       {
           e.printStackTrace();
       }
       
       return l;
   }
}
