/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outilsConnexion;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import entities.UserId;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author DJENADI
 */
public class Connexion {
    private static Connexion instance;
    private static Connection conn;
    
    private Connexion(UserId user) {
        conn = creer(user);
    }
    
    public static Connection getInstance(UserId user){
        try
		{
			if (instance == null || conn.isClosed())
			{
				synchronized(Connexion.class) {
					if (instance == null || conn.isClosed())
						instance = new Connexion(user);
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



    private Connection creer(UserId user) {
        com.microsoft.sqlserver.jdbc.SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setURL("jdbc:sqlserver://localhost;");
        dataSource.setDatabaseName("Pistons");
        dataSource.setUser(user.getUsername());
        dataSource.setPassword(user.getPassword());
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
