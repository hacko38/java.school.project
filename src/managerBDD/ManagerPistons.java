/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerBDD;

import entities.UserId;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import outilsConnexion.Connexion;

/**
 *
 * @author Hakim
 */
public class ManagerPistons {

    public ManagerPistons() {
    }
    
    public static boolean testco(UserId user){
        
            Boolean ok;
            Connection c = null;
         try {   
            c = Connexion.getInstance(user);
            ok = true;
            c.close();
            } catch (Exception ex) {
            ex.printStackTrace();
            ok=false;
        }
         return ok;
    }
    
    
    
}
