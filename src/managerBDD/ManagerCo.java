/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerBDD;

import connection.Connexion;
import entities.Lot;
import entities.Stock;
import entities.StockException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
                        list.add(new Stock(res.getString(1), res.getString(2), res.getInt(3), res.getInt(4), res.getString(5)));
                    } catch (StockException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                st.close();

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
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
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public static String launchBatch(Lot lot) {
        String s = null;
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                CallableStatement cs = c.prepareCall("{?=call LancerLot(?,?,?)}");
                cs.setInt(2, lot.getNbPiecesDemandees());
                cs.setString(3, lot.getModele());
                cs.registerOutParameter(1, java.sql.Types.INTEGER);
                cs.registerOutParameter(4, java.sql.Types.VARCHAR, 100);
                cs.execute();

                s = cs.getString(4);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return s;
    }

    public static ArrayList<Lot> tousLots() {
        ArrayList<Lot> listLot = new ArrayList<>();
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                Statement st = c.createStatement();
                ResultSet res = st.executeQuery("SELECT * FROM VueTousLots");

                while (res.next()) {
                    listLot.add(new Lot(res.getInt(1), res.getString(5), res.getInt(2)));
                }

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listLot;
    }

    public static ArrayList<Lot> lotsSelect(String modele) {
        Boolean ok;
        ArrayList<Lot> listLot = new ArrayList<>();
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                CallableStatement cs = c.prepareCall("{?=call ps_LotsSelect(?,?)}");
                cs.setString(2, modele);
                cs.registerOutParameter(1, java.sql.Types.INTEGER);
                cs.registerOutParameter(3, java.sql.Types.VARCHAR, 100);
                ok = cs.execute();

                if (ok) {
                    ResultSet res = cs.getResultSet();
                    while (res.next()) {
                        listLot.add(new Lot(res.getInt(1), res.getString(5), res.getInt(2)));

                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listLot;
    }

    public static String entreeStock(Stock stock, String nbPieces) {
        String s = null;
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                CallableStatement cs = c.prepareCall("{?=call EntreeStock(?,?,?,?)}");
                cs.setInt(2, Integer.parseInt(nbPieces));
                cs.setString(3, stock.getCategory());
                cs.setString(4, stock.getModel());
                cs.registerOutParameter(5, java.sql.Types.VARCHAR, 100);
                cs.registerOutParameter(1, java.sql.Types.INTEGER);
                cs.execute();

                s = cs.getString(5);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return s;
    }

    public static String sortieStock(Stock stock, String nbPieces) {
        String s = null;
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                CallableStatement cs = c.prepareCall("{?=call SortieStock(?,?,?,?)}");
                cs.setInt(2, Integer.parseInt(nbPieces));
                cs.setString(3, stock.getCategory());
                cs.setString(4, stock.getModel());
                cs.registerOutParameter(5, java.sql.Types.VARCHAR, 100);
                cs.registerOutParameter(1, java.sql.Types.INTEGER);
                cs.execute();

                s = cs.getString(5);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return s;
    }

}
