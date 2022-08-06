import java.util.Scanner;

public class GradingApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Marks in Maths : ");
		double maths = sc.nextDouble();
		System.out.println("Student Marks in Physics : ");
		double physics = sc.nextDouble();
		System.out.println("Student Marks in Chemistry : ");
		double chemistry = sc.nextDouble();
		
		
		if ((maths <=35) || (physics <=35) || (chemistry <=35))
			System.out.println("Student has Failed");
		else {
			double avg = (maths+chemistry+physics)/3;
			if(avg<=59)
				System.out.println("Student Grade is C");
			else if(avg<=69 && avg>59)
				System.out.println("Student Grade is B");
			else
				System.out.println("Student Grade is A");
		}
	}

}
