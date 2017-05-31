package practice3;

/**
 * Created by PC on 04.11.2016.
 */
public class Car {
    private int id;
    private String model;
    private String modelCar;
    private int year;
    private String color;
    private double price;
    private String number;

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public Car(int id, String model, String modelCar, int year, String color, double price, String number) {
        this.id = id;

        this.model = model;
        this.modelCar = modelCar;
        this.year = year;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", model='" + model + '\'' +
                ", modelCar='" + modelCar + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", number='" + number + '\'' +
                '}'+"\n";
    }
}
