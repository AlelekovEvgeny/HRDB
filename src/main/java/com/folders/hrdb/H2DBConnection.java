package com.folders.hrdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class H2DBConnection {
    static Login login = new Login();

    public static Connection getH2DBConnection()  {

        try {
            Class.forName("org.h2.Driver").newInstance();
        }
        catch(ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }
        catch(IllegalAccessException ex) {
            System.out.println("Error: access problem while loading!");
            System.exit(2);
        }
        catch(InstantiationException ex) {
            System.out.println("Error: unable to instantiate driver!");
            System.exit(3);
        }

        String URL = login.url;
        Properties info = new Properties( );
        info.put( "user", login.user);
        info.put( "password", login.password);

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, info);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
