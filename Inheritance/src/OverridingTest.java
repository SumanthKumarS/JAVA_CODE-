
public class OverridingTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.fule();
		System.out.println(car.fule());
		Bike bike = new Bike();
		bike.fule();
		System.out.println(bike.fule());
	}

}
