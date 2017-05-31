package practice4Inner.task3;

import practice4Inner.task2.EngineStatus;

public class Airplane {
    public EngineStatus getEngine(){
        class Engine implements EngineStatus {

            public Engine() {
                System.out.println("Create Engine");
            }

            @Override
            public String engineStatus() {
                return "On";
            }
        }
        return new Engine();
    }

    public static void main(String[] args) {
        EngineStatus e = new Airplane().getEngine();
        e.engineStatus();
    }
}
