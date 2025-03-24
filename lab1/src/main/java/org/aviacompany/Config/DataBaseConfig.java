package org.aviacompany.Config;
import java.sql.*;

public class DataBaseConfig {
    final static String dbURL = "jdbc:postgresql://localhost:5433/postgres";
    final static String dbUser = "postgres";
    final static String dbPass = "sosijopu";

    public static Сonnection getConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(dbURL,dbUser,dbPass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Connection;
    }
}
