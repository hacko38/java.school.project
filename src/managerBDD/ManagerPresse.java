/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerBDD;

import connection.Connexion;
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
 * @author meunier
 */
public class ManagerPresse {

    public static ArrayList<Presse> touteslespressesdispos() {
        ArrayList<Presse> liste = new ArrayList();
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery("Select * FROM vueEtatPresseDispo");
                while (rs.next()) {

                    liste.add(new Presse(rs.getInt(1), rs.getBoolean(2)));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManagerLot.class.getName()).log(Level.SEVERE, null, ex);
        }
        return liste;
    }

    public static ArrayList<Presse> touteslespresses() {
        ArrayList<Presse> liste = new ArrayList();
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery("Select * FROM vueToutesPresses order by Supprimée,Etat_Presse, Num_Presse");
                while (rs.next()) {

                    liste.add(new Presse(rs.getInt(1), rs.getBoolean(2), rs.getBoolean(3)));
                }
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
                ResultSet rs = st.executeQuery("Select * FROM vueEtatPresseDispo");
                ResultSetMetaData rsmd = rs.getMetaData();
                for (int i = 1; i <= (rsmd.getColumnCount()); i++) {
                    listetitres.add(rsmd.getColumnName(i));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerLot.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listetitres;

    }

    public static String etatPresse(boolean etatPresse) {
        String txt;
        if (etatPresse == false) {
            txt = "Disponible";
        } else {
            txt = "Indisponible";
        }
        return txt;
    }

    public static String ajoutPresse(int numPresse) {
        String retour = null;
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                CallableStatement cs = c.prepareCall("{?=call Ajouter_machine(?,?)}");
                cs.setInt(2, numPresse);
                cs.registerOutParameter(3, java.sql.Types.VARCHAR, 100);
                cs.registerOutParameter(1, java.sql.Types.INTEGER);
                cs.execute();
                retour = cs.getString(3);
                cs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerPresse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retour;
    }

    public static String supprimerPresse(int numPresse) {
        String retour = null;
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                CallableStatement cs = c.prepareCall("{?=call Supprimer_machine(?,?)}");
                cs.setInt(2, numPresse);
                cs.registerOutParameter(3, java.sql.Types.VARCHAR, 100);
                cs.registerOutParameter(1, java.sql.Types.INTEGER);
                cs.execute();
                retour = cs.getString(3);
                cs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerPresse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retour;
    }

    public static String rehabiliterPresse(int numPresse) {
        String retour = null;
        Connexion co = null;
        try {
            co = Connexion.getInstance();
            if (co != null) {
                Connection c = co.getConnection();
                CallableStatement cs = c.prepareCall("{?=call Rehabiliter_machine(?,?)}");
                cs.setInt(2, numPresse);
                cs.registerOutParameter(3, java.sql.Types.VARCHAR, 100);
                cs.registerOutParameter(1, java.sql.Types.INTEGER);
                cs.execute();
                retour = cs.getString(3);
                cs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerPresse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retour;
    }

}
