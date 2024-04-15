package org.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sqliteDemo {


    public static void main(String[] args) {
        Connection connection = null;
        try {
            // 加载SQLite JDBC驱动
            Class.forName("org.sqlite.JDBC");
            // 创建到SQLite数据库的连接
            // 如果数据库文件不存在，SQLite会自动创建它
            connection = DriverManager.getConnection("jdbc:sqlite:mybatis-all/mybatis.db");

            createTable(connection);

            // 连接成功，你可以在此处执行SQL查询等...
            System.out.println("Connected to SQLite");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createTable(Connection connection) {

        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS Employees ("
                    + "ID INT PRIMARY KEY     NOT NULL,"
                    + "NAME           TEXT    NOT NULL,"
                    + "AGE          INT     NOT NULL,"
                    + "ADDRESS      CHAR(50),"
                    + "SALARY       REAL);";
            stmt.executeUpdate(sql);







            // 插入数据、查询数据等...
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
