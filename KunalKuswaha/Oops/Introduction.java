// package KunalKuswaha.Oops;

public class Introduction {
    public static void main(String[] args) {
        // int[] rollNo = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];


        //creating object of student class
        //  Student student = new Student();
        //  student.rollNo = 1;
        //  student.name = "Saquib";
        //  student.marks = 78.5f;

        //  System.out.println("Roll NO:"+student.rollNo+" Name:"+student.name+" Marks:"+student.marks);

        //  Student student1 = new Student();
        //  student1.rollNo = 2;
        //  student1.name = "Aaquib";
        //  student1.marks = 79.5f;

        //  System.out.println("Roll NO:"+student1.rollNo+" Name:"+student1.name+" Marks:"+student1.marks);

        //  Student student2 = new Student();
        //  student2.rollNo = 3;
        //  student2.name = "Aquib";
        //  student2.marks = 74.5f;

        //  System.out.println("Roll NO:"+student2.rollNo+" Name:"+student2.name+" Marks:"+student2.marks);

        // Student saquib = new Student();
        // System.out.println(saquib.rollNo);
        // System.out.println(saquib.name);
        // System.out.println(saquib.marks);
        // saquib.greeting();

        Student omair = new Student(7346,"Omair",73.5f);
        System.out.println(omair.rollNo);
        System.out.println(omair.name);
        System.out.println(omair.marks);
        omair.greeting();
        System.out.println("New name: "+omair.name);

        Student saquib = new Student(736,"Mohammad Saquib",79.5f);
        System.out.println(saquib.rollNo);
        System.out.println(saquib.name);
        System.out.println(saquib.marks);
        saquib.greeting();
        saquib.changeName("Aquib");
        System.out.println("New name: "+saquib.name);

        Student random = new Student(saquib);
        System.out.println(random.rollNo);
        System.out.println(random.name);
        System.out.println(random.marks);

        Student random2 = new Student();
        System.out.println(random2.rollNo);
        System.out.println(random2.name);
        System.out.println(random2.marks);

    }
}

//crating class

class Student{
    int rollNo;
    String name;
    float marks;

    //creating function
    void greeting(){
        System.out.println("Hello my name is "+name);
    }

    void changeName(String newName){
        name = newName;
    }

    //creating constructor
    // Student(){
    //     this.rollNo = 7423;
    //     this.name = "Mohammad Saquib";
    //     this.marks = 85.7f;
    // }

    Student(int rollNo, String name, float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    //constructor passing with other objects
    Student(Student other){
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student(){
        //this is how you call a constructor from another constructor
        //internall: new Student
        this(74,"default name",78.5f);
    }
}
