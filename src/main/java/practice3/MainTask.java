package practice3;
import java.util.*;

public class MainTask {
	
	public static void main(String[] args){
		List<Car> autopark = CarFactory.carFactory();
		//System.out.println(autopark);
		List<Car> res1 = taskA(autopark,"Reno");
		List<Car> res2 = taskB(autopark,"Reno",5);
		List<Car> res3 = taskC(autopark, 2013, 5000);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
	}
	
	public static List<Car> taskA(List<Car> autopark, String model){
		List<Car> res=new ArrayList<Car>();
		for (Car c : autopark){
			if (c.getModel().equals(model))
				res.add(c);
		}
		return res;
	}
	public static List<Car> taskB(List<Car> autopark, String model, int n){
		List<Car> res = new ArrayList<Car>();
		int curYear=2016;
		for (Car c : autopark){
			if (c.getModel().equals(model) && curYear-c.getYear()>n)
				res.add(c);
		}
		return res;
	}
	
	public static List<Car> taskC(List<Car> autopark, int year, double price){
		List<Car> res = new ArrayList<Car>();
		for (Car c : autopark){
			if (c.getYear()==year && c.getPrice()>=price)
				res.add(c);
		}
		return res;
	}
}
