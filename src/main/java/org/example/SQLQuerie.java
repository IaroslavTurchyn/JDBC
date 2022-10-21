package org.example;

public class SQLQuerie {
    public static final String YOUNGER18 = """
            SELECT * FROM user WHERE age < 18
            """;

    public static final String NAME_ENDS_O = """
            SELECT * FROM user WHERE first_name LIKE '%o'
            """;

    public static final String AGE_BETWEEN = """
            SELECT * FROM user WHERE age BETWEEN 18 and 60
            """;

    public static final String NAMES_CONTAINS_A= """
            SELECT  count(*) FROM user WHERE first_name LIKE '%a%' ;
            """;

    public static final String ALL_USER_ADULT= """
            SELECT count(*) FROM user WHERE age>= 18;
            """;

    SQLQuerie(){

    }

}
