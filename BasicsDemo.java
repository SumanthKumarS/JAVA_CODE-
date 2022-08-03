public class BasicsDemo {
    
    int idl = 1000;
    byte age =1_8;
    short rank = 165;
    long phone = 123_456_7811L;
    int minValue = Integer.MIN_VALUE;
    int maxValue = Integer.MAX_VALUE;
    byte miValue = Byte.MIN_VALUE;
    byte maValue = Byte.MAX_VALUE;
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
    }

    public static void main(String[] args) {
        BasicsDemo bd = new BasicsDemo();
        bd.compute();
    }
    
}
