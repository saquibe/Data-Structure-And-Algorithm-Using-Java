public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schooName = "my school"; //this name is same for all all object which to be created untill it change by other object
        System.out.println(s1.schooName);
        
        Student s2 = new Student();
        System.out.println(s2.schooName);

        Student s3 = new Student();
        s3.schooName = "your school";
        System.out.println(s3.schooName);
    }
}
class Student{
    String name;
    int roll;

    static String schooName; //school name must same for all student so we can make this as static
     
    void setName(String name){
        this.name = name;
    }
    String getname(){
        return this.name;
    }
}
