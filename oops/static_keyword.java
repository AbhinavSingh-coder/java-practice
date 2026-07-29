public class static_keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolname = "bps";
        Student s2 = new Student();
        System.out.println(s2.schoolname);

        Student s3 = new Student();
        s3.schoolname = "xyz";
       
        
    }
    
}

class Student{
   String name;
   int roll;
   static String schoolname;
   void getName(String name){
    this.name = name;
   }

String setname(){
    return this.name;
}
}
