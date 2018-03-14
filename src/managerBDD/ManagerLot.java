/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerBDD;

import connection.Connexion;
import entities.Lot;
import entities.Presse;
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
 * @author quent
 */
public class ManagerLot {

    public static ArrayList<Lot> touslesLotsLances() {
        ArrayList<Lot> liste = new ArrayList();
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery("Select * from VueLotsLances");
                while (rs.next()) {
                    liste.add(new Lot(rs.getInt(1), rs.getString(2), rs.getInt(3)));
                }
                st.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManagerLot.class.getName()).log(Level.SEVERE, null, ex);
        }
        return liste;
    }

    public static ArrayList<String> titrescolonnes() {
        ArrayList<String> listetitres = new ArrayList();
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery("Select * from VueLotsLances");
                ResultSetMetaData rsmd = rs.getMetaData();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    listetitres.add(rsmd.getColumnName(i));
                }
                st.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerLot.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listetitres;

    }

    public static ArrayList<Lot> touslesLotsDemarres() {
        ArrayList<Lot> liste = new ArrayList();
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery("Select * from VueLotsDemarres");
                while (rs.next()) {
                    liste.add(new Lot(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), 1));
                }
                st.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManagerLot.class.getName()).log(Level.SEVERE, null, ex);
        }
        return liste;
    }

    public static ArrayList<String> titrescolonnesdemarres() {
        ArrayList<String> listetitres = new ArrayList();
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery("Select * from VueLotsDemarres");
                ResultSetMetaData rsmd = rs.getMetaData();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    listetitres.add(rsmd.getColumnName(i));
                }
                st.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerLot.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listetitres;
    }

    public static String demarrerLot(int idLot, int idPresse) {

        String retour = null;

        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                CallableStatement stmt = c.prepareCall("{?=call DemarrerLot(?,?,?)}");
                stmt.setInt(2, idLot);
                stmt.setInt(3, idPresse);
                stmt.registerOutParameter(4, java.sql.Types.VARCHAR, 100);
                stmt.registerOutParameter(1, java.sql.Types.INTEGER);
                stmt.execute();
                retour = stmt.getString(4);
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerLot.class.getName()).log(Level.SEVERE, null, ex);

        }
        return retour;

    }

    public static String libererLot(int idLot) {
        String retour = null;

        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                CallableStatement stmt = c.prepareCall("{?=call Liberer_presse(?,?)}");
                stmt.setInt(2, idLot);
                stmt.registerOutParameter(3, java.sql.Types.VARCHAR, 100);
                stmt.registerOutParameter(1, java.sql.Types.INTEGER);
                stmt.execute();
                retour = stmt.getString(3);
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerLot.class.getName()).log(Level.SEVERE, null, ex);

        }
        return retour;
    }

}
