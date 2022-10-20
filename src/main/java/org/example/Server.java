package org.example;

import java.sql.*;
import java.util.ArrayList;

public class Server {
    public static Connection connect (String url,String username,String password) throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public static void  list (PreparedStatement statement,String sqlQuerie) throws SQLException {
        var users = new ArrayList<>();

        ResultSet resultSet = statement.executeQuery(sqlQuerie);
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setFirst_name(resultSet.getString("first_name"));
                user.setLast_name(resultSet.getString("last_name"));
                user.setAge(resultSet.getInt("age"));
                users.add(user);
            }

            users.forEach(System.out::println);

        }

        public static void count (PreparedStatement preparedStatement,String sqlQuerie) throws SQLException {
            ResultSet resultSet = preparedStatement.executeQuery(sqlQuerie);
            while (resultSet.next()){
                int count =resultSet.getInt("count(*)");
                System.out.println(count);
            }
        }


    }
