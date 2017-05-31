package practice4Inner.task1;
/**
 * Created by PC on 09.11.2016.
 */

public class Airplane {
    private String name;
    AirplaneEngine left = new AirplaneEngine("Left");
    AirplaneEngine right = new AirplaneEngine("Right");

    public Airplane(String name) {
        this.name = name;
    }

    public class AirplaneEngine implements IEngine {
        String nameAirplaneEngine;

        public AirplaneEngine(String nameAirplaneEngine) {
            this.nameAirplaneEngine = nameAirplaneEngine;
        }

        @Override
        public String start() {
            return "Name Airplane: " + name + "Start";
        }

        public class Engine {
            String start(){
                return "Strung" + name;
            }
        }
    }


}



