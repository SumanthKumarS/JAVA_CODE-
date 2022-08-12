
public class MACBookPro extends MACBook {
	@Override
	public void start() {
		System.out.println("inside mackbookpro stat()");
	}
	@Override
	public void shutdown() {
		System.out.println("inside mackbookpro shutdown()");
	}
	public void promethod() {
		System.out.println("inside mackbookpro method");
	}
}
