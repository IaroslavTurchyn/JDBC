package org.example;

import java.sql.*;
import java.util.ArrayList;

import static org.example.JDBCConstans.*;
import static org.example.SQLQuerie.*;


public class Main {
    public static void main(String[] args) throws SQLException {

        Server.list(YOUNGER18);
        System.out.println("---------------------");

        Server.list(NAME_ENDS_O);
        System.out.println("---------------------");

        Server.list(AGE_BETWEEN);
        System.out.println("---------------------");

        Server.count(NAMES_CONTAINS_A);
        System.out.println("---------------------");

        Server.count(ALL_USER_ADULT);


    }


}