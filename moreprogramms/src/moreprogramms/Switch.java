package moreprogramms;

public class Switch {

	public static void main(String[] args) {
		String choice = " ";
		switch(choice){
		case "Check Balance":	
			System.out.println("Check Balance");
			break;
		case "Check Pin":
		System.out.println("Check Pin");
			break;
		case "Withdraw cash":
		System.out.println("Withdraw cash");
			break;
		case "Deposit Check":
		System.out.println("Deposit Check");
			break;
		default:
			System.out.println("Time Out");
			break;
		}
	}

}
