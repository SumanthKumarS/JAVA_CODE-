
public class CompileTimeBinding {
	void add(int a,int b) {
		int result = a+b;
		System.out.println("Result is: "+result);
	}
	void add(float a,float b) {
		float result = a+b;
		System.out.println("Result is: "+result);
	}
	
	void add(int a,int b,int c) {
		int result = a+b+c;
		System.out.println("Result is: "+result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimeBinding obj = new CompileTimeBinding();
		obj.add(10, 20);
		obj.add(3.4f, 3.5f);
		obj.add(10, 20,50);
		
	}	

}
