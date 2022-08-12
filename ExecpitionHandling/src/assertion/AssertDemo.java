package assertion;

public class AssertDemo {

	public static void main(String[] args) {
		int withdrawAmount =200;
		int currentBalance = 100;
		assert(withdrawAmount<=currentBalance):"withdrawl is more than current amount";
	}

}
