package ArrayList;

import java.util.ArrayList;

public class MyClass {
  
	public static void branch(int x, int y) {
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
		if (x < 0) {
			x = -x;
		}
		if (y < 0) {
			y = -y;
		}
		if (x < y) {
			System.out.println("abs(x)<abs(y)");
		} else if (x == 0) {
			System.out.println("x==y==0");
		} else {
			System.out.println("x>=y>=0");
		}
	}
}