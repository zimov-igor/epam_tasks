package comzimovten;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;


public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtwst";//?autoReconnect=true&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "lion";

    public static void main(String[] args) {
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement() ){
            statement.execute("insert into users (name, age, email) values('Dimazadrot' , 21 , '5555@mail.com');");
            ///int res = statement.executeUpdate("update users set name='Gnom', age= 55 where id=5;");
            ///System.out.println(res);
            ///ResultSet res = statement.executeQuery("SELECT * FROM users;");
            /*statement.addBatch("insert into users (name, age, email) values('Vovan1' , 21 , '5555@mail.com');");
            statement.addBatch("insert into users (name, age, email) values('Vovan2' , 21 , '5555@mail.com');");
            statement.addBatch("insert into users (name, age, email) values('Vovan3' , 21 , '5555@mail.com');");

            statement.executeBatch();
            //statement.clearBatch();
            boolean status = statement.isClosed();
            System.out.println(status);

            statement.getConnection();
            statement.close();*/
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
