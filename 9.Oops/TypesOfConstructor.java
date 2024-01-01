//there are mainly three type of constructor 
//1.non parametrized constructor 2.parametrized constructor 3.copy constructor
public class TypesOfConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Saquib");
        Student s3 = new Student(634);
    }
}
class Student{
    String name;
    int rollNum;
    Student(){ //non parametrized constructor
        System.out.println("Constructor called....");
    }
    Student(String name){//parametrized constructor
        this.name = name;
    }
    Student(int rollNum){
        this.rollNum = rollNum;
    }
}
