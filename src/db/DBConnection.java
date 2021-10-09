package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Dilki Cooray <dilkicooray97@gmail.com>
 * since 10/7/2021
 */
public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thogakade","root","1234");
    }

    public static DBConnection getInstance() throws Exception{
        if (dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    public Connection getConnection(){
        return connection;
    }
}
