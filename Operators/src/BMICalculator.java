
public class BMICalculator {

	public static void main(String[] args) {
		// bmi = ( wegight in kg/ height *height)
		double height = 6.2;
		double weight = 85;
		double heightInMeters = height * 0.4536;
		double bmi = weight /(heightInMeters * height);
		System.out.println("reultant bmi "+bmi);
	}

}
