package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=PRJ321_Student;";
    public String userDB = "sa";
    public String passDB = "123";

    public ConnectDB() {
        
    }
    
    //DATABASE ALREADY EXIST! TO CREATE TABLE
    public Connection getConnection() throws Exception{
        Class.forName(driverName);
        Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
        System.out.println("Connect succesfully");
        return con;
    }
        
}
