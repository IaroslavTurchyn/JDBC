package org.example;

import java.sql.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = Server.connect(JDBCConstans.URL, JDBCConstans.USERNAME, JDBCConstans.PASSWORD);
        PreparedStatement statement = connection.prepareStatement(SQLQuerie.CREATE);
        statement.execute();
        PreparedStatement insert = connection.prepareStatement(SQLQuerie.INSERT);
      insert.executeUpdate();

        ArrayList<User> list = Server.list(statement, SQLQuerie.YOUNGER18);
        list.forEach(System.out::println);
        System.out.println("---------------------");

        ArrayList<User> list1 = Server.list(statement, SQLQuerie.NAME_ENDS_O);
        list1.forEach(System.out::println);
        System.out.println("---------------------");

        ArrayList<User> list3 = Server.list(statement, SQLQuerie.AGE_BETWEEN);
        list3.forEach(System.out::println);

        System.out.println("---------------------");

        Server.count(statement,SQLQuerie.NAMES_CONTAINS_A);


        System.out.println("---------------------");

        Server.count(statement,SQLQuerie.ALL_USER_ADULT);


    }


}