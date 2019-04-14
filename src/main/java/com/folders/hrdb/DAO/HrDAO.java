package com.folders.hrdb.DAO;

import javax.transaction.Transactional;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static com.folders.hrdb.H2DBConnection.getH2DBConnection;

@Transactional
public class HrDAO {
    public void hrDataInsert(String s) throws SQLException {
        System.out.println("Вот это отправляю в базу => "+s);
        String selectTableSQL = s;
        Statement statement;

        Connection connection= getH2DBConnection();
        statement = connection.createStatement();
        statement.execute(selectTableSQL);
    }
}