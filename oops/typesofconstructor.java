public class typesofconstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Abhinav");
        Student s3 = new Student(12);



        Student s4 = new Student();
        s4.name = "tonny";
        s4.roll = 123;
        s4.password = "abc";

        Student s5 = new Student(s4); //copy;
         s5.password = "xyz"; 

        
    }
}

class Student{
    String name;
    int roll;
    String password;


    Student(Student s4){
        this.name = s4.name;
        this.roll = s4.roll;
    }
    Student(){
        System.out.println("Constructor is called");
    }

    Student(String name){
        this.name = name;

    }

    Student(int roll){
        this.roll = roll;
    }
}
