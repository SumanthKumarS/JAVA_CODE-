public class Student {
    static int computeCount;
    int id;
    String name;
    String gender;
    int age;
    long phone;
    double gpa;
    char degree;

    boolean international;
    double tuitionFees = 12000.0;
    double interationalFees = 5000.0;
    void compute(){
        computeCount = computeCount+1;
        int nextId = id+1;
        if(international){
            tuitionFees = tuitionFees + interationalFees;
        }
        System.out.println("id"+id);
        System.out.println("next_id"+nextId);
        System.out.println("name"+name);
        System.out.println("gender"+gender);
        System.out.println("age"+age);
        System.out.println("phone"+phone);
        System.out.println("gpa"+gpa);
        System.out.println("degree"+degree);
        System.out.println("tuitionFees"+tuitionFees);
        System.out.println("compute counts"+computeCount);

    }

    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1000;
        s.name = "John";
        s.gender = "male";
        s.age = 18;
        s.phone = 223_245_7890L;
        s.gpa = 3.8;
        s.degree = 'B';
        s.international = false;
        s.compute();
        Student computeCount  =  new Student();
    }
}
