
import java.math.BigDecimal;
public class BasicsDemo {
    
    int idl = 1000;
    byte age =1_8;
    short rank = 165;
    long phone = 123_456_7811L;
    int minValue = Integer.MIN_VALUE;
    int maxValue = Integer.MAX_VALUE;
    byte miValue = Byte.MIN_VALUE;
    byte maValue = Byte.MAX_VALUE;
    char degree = '\u0042';
    float gpa = 3.8f;
    double dgpa = 3.8;
    float fgpa = 3.888888888888888888888888888888888888888888888888888888888888888888888f;
    double ddgpa = 3.8444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444;
    void compute(){
        
        int next_idl = idl+1;
        System.out.println(idl);
        System.out.println(next_idl);
        System.out.println(age);
        System.out.println(phone);
        System.out.println(minValue);
        System.out.println(maxValue);
        System.out.println(miValue);
        System.out.println(maValue);
        System.out.println(gpa);
        System.out.println(dgpa);
        System.out.println(fgpa);
        System.out.println(ddgpa);
        System.out.println(degree);
        
    }
    static void primitive(){
        System.out.println("primitive value ..");
        int intHex = 0x0041; // 16*1+16*4
        System.out.println(intHex);
        long longHex = 0x0041L; // 16*1+16*4
        System.out.println(longHex);
        //only form java 7
        System.out.println("primitive binary value ..");
        int intBinary = 0b1001;//0b01000001;
        System.out.println(intBinary);
        System.out.println("primitive octal value ..");
        int iBinary = 0101;//0b01000001;
        System.out.println(iBinary);
    }
    public static void main(String[] args) {
        BasicsDemo bd = new BasicsDemo();
        bd.compute();
        primitive();

        System.out.println(1-0.9);
        double price =1000;
        double dicountper = 0.9;
        double discountamt = price*dicountper;
        System.out.println(price - discountamt);
        BigDecimal first = new BigDecimal("0.1");
        BigDecimal second = new BigDecimal("0.2");
        System.out.println(second+" "+first);
    }
    
}
