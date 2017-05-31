package practice7_Exeption;


public class Car {
    public static void main(String[] args) {
        Engine engin = null;
        try {
            engin.start();  //NullPointerException unchecked
        }catch (Exception e){
            System.err.println(e);
        }
    }
}

class Engine {
    public void start(){}
}
