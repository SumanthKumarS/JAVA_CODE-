
public class LabledBlock {

	public static void main(String[] args) {
		int x= 20;
		l1:{
			System.out.println("block begins");
			if(x==20) {
				break l1;
			}
			System.out.println("block ends");
		}
		System.out.println("ouside block");
	}

}
