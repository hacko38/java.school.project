/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerBDD;

import connection.Connexion;
import entities.Stock;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Stock;

/**
 *
 * @author DJENADI
 */
public class ManagerCo {

    public ManagerCo() {
    }

    public static String getRole() {
        String s = null;
        Connexion co = null;
        try {
            // djenadi
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                CallableStatement cs = c.prepareCall("{call ps_GetRole(?)}");
                cs.registerOutParameter(1, java.sql.Types.VARCHAR, 50);
                cs.execute();

                s = cs.getString(1);
                cs.close();
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return s;
    }

    public static ArrayList<Stock> getStock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static ArrayList<String> getStockColonne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
