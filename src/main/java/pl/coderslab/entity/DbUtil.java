package pl.coderslab.entity;

import java.sql.*;

public class DbUtil {
    public static final String url = "jdbc:mysql://localhost:3306/SQL_Workshop?useSSL=false&characterEncoding=utf8";
    public static final String root = "root";
    public static final String pass = "coderslab";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, root, pass);

    }

    public static void main(String[] args) throws SQLException {
        Connection conn = getConnection();

    }
}