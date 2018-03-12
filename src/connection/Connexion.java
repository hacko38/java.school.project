/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import tools.Tools;

/**
 *
 * @author DJENADI
 */
public class Connexion {

    private static Connexion instance = null;
    private Connection conn = null;
    private String username = "";
    private String password = "";

    private Connexion(String username, String password) throws SQLException 
    {
        this.username = username;
        this.password = password;
        conn = creer();
    }

    
    public static Connexion getInstance() {
          return instance;
    }

    public static Connexion getInstance(String username, String password) {
        try
        {           
            if (!Tools.isNull(username) && !Tools.isNull(password))
            {
                instance = new Connexion(username, password);
            }          
            else
              instance = null;         
        } 
        catch (Exception e) 
        {
            instance = null;
            System.out.println(e.getMessage());
        }
        return instance;
    }

    public Connection getConnection() {
        return conn;
    }

    
    private Connection creer() throws SQLException {
        com.microsoft.sqlserver.jdbc.SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setURL("jdbc:sqlserver://serveur-sql2017");
        dataSource.setDatabaseName("Pistons");
        dataSource.setUser(username);
        dataSource.setPassword(password);

        return dataSource.getConnection();
    }


}
