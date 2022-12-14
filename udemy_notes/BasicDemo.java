package udemy_notes;

public class BasicDemo {
        // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
        static void print() {
          System.out.println("\n\nInside print ...");
          System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
          System.out.println();                 // Print empty line
          System.out.print("Hello, world!!");   // Cursor stayed after the printed string
          System.out.println("Hello,");
          System.out.print(" ");                // Print a space
          System.out.print("world!!");
        }
        
        static void primitives() {
          System.out.println("\n\nInside primitives ..."); 
          // literals demo
          int intHex = 0x0041;
          System.out.println("intHex: " + intHex);
          int intBinary = 0b01000001;
          System.out.println("intBinary: " + intBinary);
          int intChar = 'A'; // holds decimal equivalent, which is 65
          System.out.println("intChar: " + intChar);
          int intUnderscore = 1_23_456;
          System.out.println("intUnderscore: " + intUnderscore);
          
          char charA = 'A';
          System.out.println("charA: " + charA);
          char charInt = 65;
          System.out.println("charInt: " + charInt);
          char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
          System.out.println("charUnicode1: " + charUnicode1);
          char charUnicode2 = 0x41;     // 4 * (16 power 1 )+ 1 * (16 power 0)
          System.out.println("charUnicode2: " + charUnicode2);
          char charBinary = 0b01000001; // binary corresponding to decimal 65
          System.out.println("charBinary: " + charBinary);	  		  	  
        }
      
        static void typeCasting() {
          System.out.println("\nInside typeCasting ...");
          // Explicit casting
          long y = 42;
          //int x = y;
          int x = (int)y;
          
          // Information loss due to out-of-range assignment
          byte narrowdByte = (byte)123456;
          System.out.println("narrowdByte: " + narrowdByte); 
          
          // Truncation
          int iTruncated = (int)0.99;
          System.out.println("iTruncated: " + iTruncated); 
          
          // Implicit cast (int to long)
          y = x;
          
          // Implicit cast (char to int)
          char cChar = 'A';
          int iInt = cChar; 
          System.out.println("iInt: " + iInt);
          
          // byte to char using an explicit cast
          byte bByte = 65;
          cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
          System.out.println("cChar: " + cChar);
        }
        
        static int[] scores;
        static void arrays() {
        //    System.out.println("\nInside arrays ...");
        // //    int[] myArray = new int[]{9, 11, 2, 5, 4, 4, 6};
        //    int[] myArray = {9, 11, 2, 5, 4, 4, 6};
        //    System.out.println("myArray.length: " + myArray.length);  
            scores =  new int[]{0,20,30,40};
            // scores[0] = 10;
            // scores[2] = 20;
            // scores[3] = 30;
            // scores[4] = 40;
            System.out.println("midterm1: "+scores[0]);
            System.out.println("midterm2: "+scores[1]);
            System.out.println("final: "+scores[2]);
            System.out.println("project: "+scores[3]);
            System.out.println("len of array: "+scores.length);
            Student[] s1 = new Student[3];
            s1[0] = new Student();
            s1[1] = new Student();
            s1[2] = new Student();
            System.out.println("student1: "+s1[0]);
            System.out.println("student2: "+s1[1]);
            System.out.println("student3: "+s1[2]);
            Student[] s2 = {new Student()
            ,new Student(),new Student()};
            System.out.println("student1: "+s2[0]);
            System.out.println("student2: "+s2[1]);
            System.out.println("student3: "+s2[2]);
            
        }
    
	
      
        public static void main(String[] args) {	
          // Language Basics 1
          //print();				
          //primitives();
          //typeCasting();
          arrays();	
        }       
}
