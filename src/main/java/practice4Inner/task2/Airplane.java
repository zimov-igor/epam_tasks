package practice4Inner.task2;

/**
 * Created by PC on 09.11.2016.
 */
public class Airplane {
    private static String airplaneName = "777";
    private String power = "1000";

    public EngineStatus getEngine(){
        return new Engine();
    }

    private static class Engine implements EngineStatus {

        public Engine() {
            System.out.println("Create Engine");
        }

        @Override
        public String engineStatus() {
            return "Name: " + airplaneName + "On" ;
        }

        public String getPower(){
            return new Airplane().power;
        }
    }

}
