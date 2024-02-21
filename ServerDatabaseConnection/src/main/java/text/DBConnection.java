package text;

import static text.DBInfo.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static Connection con = null;

    private DBConnection() {

    }

    static {
        try {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(dbUrl, uName, pWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//end of the block

    public static Connection getCon() {
        return con;
    }
}