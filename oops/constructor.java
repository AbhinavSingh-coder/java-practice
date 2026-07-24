public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("xyz");
        System.out.println(s1.name);
        
    }
    
}

class Student{
    String name;
    int roll;

    Student(String name){    //constructor
        this.name = name;
    }

}
