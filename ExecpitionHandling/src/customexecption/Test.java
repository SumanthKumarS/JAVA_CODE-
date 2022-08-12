package customexecption;

public class Test {

	public static void main(String[] args) throws CheckedCustomeExecption {
//		throw new UnCheckedCustomeExeception("business Exception occured");
		
		throw new CheckedCustomeExecption("business Exception that needs to handelled");

	}

}
