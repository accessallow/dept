
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLConnector {

    private static String  address = "jdbc:mysql://localhost/d1";
    private static String database_name = "d1";
    private static int port_number = 3306;
    private static String user_name = "root";
    private static String password = "";

   

    public static ResultSet sql(String sql_string) {
        
        ResultSet rs = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
           //String db_url = address + ":" + port_number + "/" + database_name;
           // System.out.println(db_url);
            Connection connection = DriverManager.getConnection(address, user_name, password);
            Statement statement = connection.createStatement();
           
            rs = statement.executeQuery(sql_string);
            if (rs == null) {
                System.out.println("Error in Query : " + sql_string);
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return rs;
    }
   public static boolean sql_e(String sql_string){
        boolean rs = false;
        try {

            Class.forName("com.mysql.jdbc.Driver");
           // String db_url = address + ":" + port_number + "/" + database_name;
          //  System.out.println(db_url);
            Connection connection = DriverManager.getConnection(address, user_name, password);
            Statement statement = connection.createStatement();
            
               rs = statement.execute(sql_string);
                
            
            
            if (rs == true) {
                System.out.println("Error in Query : " + sql_string);
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return rs;
   }
}
