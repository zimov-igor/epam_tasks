package practice7_Exeption;

import java.sql.SQLException;

/**
 * Created by PC on 30.11.2016.
 */
public class UserSecond {
    public void getConection() throws SQLException{
        throw new SQLException();
    }
    public void addUser() {
        try {
            getConection();
        }catch (SQLException e){
            System.err.println(e);
            //e.printStackTrace();
        }finally {
            System.out.println("Object has been checked - inside");
        }
    }
    public void getUser(Car car){
        try {
            if (car == null) throw new  SQLException();
        }catch (SQLException e){
            System.err.println(e);
        }finally {
            System.out.println("Finally");
        }

    }

    public static void main(String[] args) {
        UserSecond userSecond = new UserSecond();
        Car car = new Car();
       // car = null;

        userSecond.addUser();

        try {
            userSecond.getConection();
        } catch (SQLException e) {
            System.err.println(e);
            //e.printStackTrace();
        }finally {
            System.out.println("Object has been checked - outside");
        }

        userSecond.getUser(car);
    }
}
