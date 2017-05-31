package practice4Inner.task4;


import practice4Inner.task2.EngineStatus;

public class Airplane {
    EngineStatus engine = new EngineStatus(){
        @Override
        public String engineStatus() {
            return "On";
        }
    };

    public static void main(String[] args) {
        System.out.println(new Airplane().engine.engineStatus());
        //new Airplane().engine.engineStatus();
    }
}
