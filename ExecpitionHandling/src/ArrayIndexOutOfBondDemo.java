
public class ArrayIndexOutOfBondDemo {

	public static void main(String[] args) {
		int arr[] = {10,20,30};
		try {
			System.out.println("Elements of array");
			for(int i=0;i<=arr.length;i++) {
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException ar) {
			System.out.println("index beyond array length");
		}
		System.out.println("After Elements of array");
	}
	void method() {
		System.out.println("method one");
	}

}
