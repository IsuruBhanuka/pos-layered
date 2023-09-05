/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import pos.layered.db.DBConnection;
/**
 *
 * @author BHANUKA
 */
public class CrudUtil {
    private static PreparedStatement getPreparedStatement(String query, Object... args) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i+1, args[i]);
            }
        }
        return preparedStatement;
    }
    
    public static boolean executeUpdate(String query, Object... args) throws SQLException {
        return getPreparedStatement(query, args).executeUpdate() > 0;
    }
    
    public static ResultSet executeQuery(String query, Object... args) throws SQLException {
        return getPreparedStatement(query, args).executeQuery();
    }
}
