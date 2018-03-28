
package outdoorparadise;
import java.sql.*;

/**
   A simple data source for getting database connections. 
*/
public class DbConnection
{

   private static String dbserver;
   private static String database;
   private static String username;
   private static String password;

   private static Connection activeConn;

   /**
      Initializes the data source.
      Checks if MySQL Driver is found
      contains the database driver,
      Fill variabels dbserver, database, username, and password
    *
    * TODO get variabels from a configuration file!!! 
    * or credentials manager
    * Hardcoded is bad code!!!
   */
   private static void init()
         
   {
      try {
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver);
      }
      catch (ClassNotFoundException e) {
          System.out.println(e);
      }


      dbserver="Localhost";
      database="op";
      username = "root";
      password = "aruba";
      
      
   }

   /**
      Gets a connection to the database.
      @return the database connection
   */
   public static Connection Connect() throws SQLException
   {
       if (activeConn==null) {
           init();
           activeConn=createConnection();
       }
       else {
           if (!activeConn.isValid(0)) {
               activeConn=createConnection();
           }
       }

       return activeConn;

   }

   private static Connection createConnection() throws SQLException
   {

        String connectionString = "jdbc:mysql://" + dbserver + "/" + database + "?" +
                "user=" + username + "&password=" + password;

       return DriverManager.getConnection(connectionString);
   }
   
   public static void closeConnection() {
       if (activeConn!=null) {
           try {
                activeConn.close();
           }
           catch(SQLException e) {
               //to catch and do nothing is the best option
               //don't know how to recover from this exception
               
           }
           finally {
               activeConn=null;
           }
               
       }
       
   }
}