package mostwanted;

public class ClassCastDemo {

	public static void main(String[] args) {
		Object ob = new Object();
		if(ob instanceof String) {
			String s = (String) ob;
		}
		
	}

}
