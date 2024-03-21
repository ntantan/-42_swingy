package com.ntan.swingy.models.db;
import java.sql.*;

public class SQLiteJDBC {
    public static void main( String args[] ) {
        Connection c = null;
        Statement stmt = null;
        
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:swingy/src/main/java/com/ntan/swingy/db/db.sqlite");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();

            String createHeroQuery =   
            "CREATE TABLE IF NOT EXISTS hero " +
            "(id INT PRIMARY KEY           NOT NULL," +
            " name           CHAR(50)      NOT NULL," +
            " hero_class     CHAR(50)      NOT NULL," + 
            " level          INT           DEFAULT 1," + 
            " experience     INT           DEFAULT 1," +
            " attack         INT           DEFAULT 10," +
            " defense        INT           DEFAULT 10," +
            " hit_points     INT           DEFAULT 50)";
            stmt.executeUpdate(createHeroQuery);

            stmt.close();
            c.close();
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
        System.out.println("Table created successfully");
     }
}