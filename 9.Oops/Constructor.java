public class Constructor {
    public static void main(String[] args) {
        Student s = new Student(); //
        // System.out.println(s.name);
    }
}
class Student{
    String name;
    int rollNum;
    Student(){//this is constructor same name as class name 
        // this.name = name;
        System.out.println("Constructor is called.....");
    }
}
