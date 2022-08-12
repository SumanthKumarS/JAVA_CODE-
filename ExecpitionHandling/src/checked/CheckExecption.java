package checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckExecption {
	
	void readfile() throws FileNotFoundException{
			FileInputStream file = new FileInputStream("");
			
	}

	public static void main(String[] args) throws FileNotFoundException {
		CheckExecption ck = new CheckExecption();
		ck.readfile();
//		try {
//			
//		}catch(FileNotFoundException e) {
//			System.out.println("file not found execption");
//		}
	}

}
