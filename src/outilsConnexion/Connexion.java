/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outilsConnexion;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import utils.Tools;

/**
 *
 * @author DJENADI
 */
public class Connexion {
    private static Connexion instance;
    private static Connection conn;
    private static String username;
    private static String password;
    
    private Connexion() {
        conn = creer();
    }
    
    public static Connection getInstance(){
        try
		{
			if (instance == null || conn.isClosed())
			{
				synchronized(Connexion.class) {
					if (instance == null || conn.isClosed())
						instance = new Connexion();
				}
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			conn = null;
		}
		return conn;
    } 

    public static boolean setup(String username, String password){
        boolean ok;
        if(Tools.isNull(password))
            ok = false;
        else{
            ok = true;
            Connexion.password = password;
        }
        return ok;
    }

    private Connection creer() {
        com.microsoft.sqlserver.jdbc.SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setURL("jdbc:sqlserver://serveur-sql2017");
        dataSource.setDatabaseName("Pistons");
        dataSource.setUser(username);
        dataSource.setPassword(password);
        Connection connection = null;
        try
		{
			conn = dataSource.getConnection();
		}
		catch (Exception e)
		{
			System.out.println("Connexion échouée !\r> " + e.getMessage());
		}
		return conn;
    }
    
    public void close()
         {
                 try
                 {
                     if ( conn != null && !conn.isClosed())
                         conn.close();
                 }
                 catch (SQLException e)
                 {
                         e.printStackTrace();
                 }
         }
         @Override
         public Object clone() throws CloneNotSupportedException
         {
                 throw new CloneNotSupportedException();
         }
    
}
