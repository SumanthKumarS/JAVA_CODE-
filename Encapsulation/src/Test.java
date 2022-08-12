
public class Test {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setFirstName("ram");
		c.setLastName("monhan");
		c.setCreditCar("1234");
		System.out.println("firstname " +c.getFirstName());
		System.out.println("lastname " +c.getLastName());
		System.out.println("creditcardno " +c.getCreditCar());
	}

}
