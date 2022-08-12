
public class RunTimeBuinding {

	public static void main(String[] args) {
//		MACBook m1 = new MACBookPro();
//		MACBook m2 = new MACBookAir();
		AppleLaptop m1 = new MACBookPro(); //upcasting
		AppleLaptop m2 = new MACBookAir();
		m1.start();
		m1.shutdown();
		
		m2.start();
		m2.shutdown();
		
		MACBookPro m3 = (MACBookPro)m1; // downcasting
		m3.start();
		m3.shutdown();
		m3.promethod();
		
		MACBookAir m4 = (MACBookAir)m2;
		m4.start();
		m4.shutdown();
	}

}
