package org.example;

public class SQLQuerie {
    public static final String CREATE= """
            CREATE TABLE IF NOT EXISTS user(
            id INT PRIMARY KEY AUTO_INCREMENT,
            first_name varchar (50),
            last_name varchar (50),
            age int NOT NULL)
            """;

    public static final String INSERT= """
            INSERT INTO user (first_name, last_name,age) VALUES
             ('Petro', 'Ravlyk', 15),
             ('Anna','Kolombo',33),
             ('Ivano', 'Koma',17),
             ('Yaroslav', 'Pauk',13),
             ('Oleksandr', 'Tarakan',44),
             ('Olha', 'Trach',65)
            """;

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
            SELECT  count(*) FROM user WHERE first_name LIKE '%a%' or '%a' or 'a%';
            """;

    public static final String ALL_USER_ADULT= """
            SELECT count(*) FROM user WHERE age>18;
            """;

    SQLQuerie(){

    }

}
