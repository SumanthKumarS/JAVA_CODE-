package moreprogramms;

public class IfElseLadder {

	public static void main(String[] args) {
		String choice = "Check Balance";
		if(choice.equals("Check Balance"))
			System.out.println("Check Balance");
		else if(choice.equals("Check Pin"))
			System.out.println("Check Pin");
		else if(choice.equals("Withdraw cash"))
			System.out.println("Withdraw cash");
		else if(choice.equals("Deposit Check"))
			System.out.println("Deposit Check");
		else
			System.out.println("Time Out");
	}

}
