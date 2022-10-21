package org.example;

import java.sql.*;
import java.util.ArrayList;

import static org.example.JDBCConstans.*;
import java.sql.Statement;

public class Server {


    public static void  list (String sqlQuerie) throws SQLException {

        try(Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD); Statement statement = connection.createStatement();){

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

        } catch (SQLException e){
            System.out.println("error"+ e.getMessage());
        }
    }

        public static void count (String sqlQuerie) {
            try(Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD); Statement statement = connection.createStatement();) {

                ResultSet resultSet = statement.executeQuery(sqlQuerie);
                while (resultSet.next()) {
                    int count = resultSet.getInt("count(*)");
                    System.out.println(count);
                }
            } catch (SQLException e) {
                System.out.println("error" + e.getMessage());
            }
        }



    }
