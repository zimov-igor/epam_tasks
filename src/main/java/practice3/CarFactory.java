package practice3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 04.11.2016.
 */
public class CarFactory {
    private static List<Car> cars = new ArrayList<>();


    public static List<Car> carFactory(){
        cars.add(new Car(1, "Reno", "Reno_1", 2000, "Red", 16.400, "CX56L1"));
        cars.add(new Car(2, "Mazda", "CX-5", 2006, "Green", 56.400, "CV6743"));
        cars.add(new Car(3, "Reno", "Reno11", 2013, "Yellow", 60000, "CX56L1"));
        cars.add(new Car(4, "Reno", "Reno12", 1994, "Pink", 4.400, "CX56L1"));
        cars.add(new Car(5, "Reno", "Reno13", 2016, "Red11", 1.400, "CX55f6L1"));
        cars.add(new Car(6, "Reno", "Reno14", 1990, "Red22", 2.400, "CX5ff6L1"));
        cars.add(new Car(7, "Reno", "Reno15", 2007, "Red33", 346.400, "CX56L1"));
        cars.add(new Car(8, "Reno", "Reno16", 2008, "Red44", 1000.0, "CX56L1"));

        return  cars;

    }
}
