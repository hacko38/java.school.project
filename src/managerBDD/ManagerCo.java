/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerBDD;

import connection.Connexion;
import entities.Stock;
import entities.StockException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        ArrayList<Stock> list = new ArrayList<>();
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                Statement st = c.createStatement();
                ResultSet res = st.executeQuery("SELECT * FROM VueStocksCategorie");

                while (res.next()) {
                    try {
                        list.add(new Stock(res.getString(1), res.getString(2), res.getInt(3), res.getInt(4)));
                    } catch (StockException ex) {
                        ex.getMessage();
                    }
                }
                st.close();
         

            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return list;
    }

    public static ArrayList<String> getStockColonne() {
        ArrayList<String> list = new ArrayList<>();
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                Statement st = c.createStatement();
                ResultSet res = st.executeQuery("SELECT * FROM VueStocksCategorie");
                ResultSetMetaData rsmd = res.getMetaData();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    list.add(rsmd.getColumnName(i));
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return list;
    }

}
