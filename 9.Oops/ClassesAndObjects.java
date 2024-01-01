// package 9.Oops;

public class ClassesAndObjects {
    public static void main(String[] args) {
        //creating object for pen class
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        //creating object for student class
        Student s = new Student();
        s.calculatePercentage(30, 40, 50, 60);
        System.out.println(s.percentage);
    }
}
//there are may be multiple classes in single progaram
//creating new class
class Pen{
    //properties of class
    String color;
    int tip;
    //funtions of class
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
//creating another class name as student as we know there can be multiple classes in single program
//class is the blue print of an object
class Student{
    //properties
    String name;
    int number;
    float percentage;
    //creating funtion
    void calculatePercentage(int phy, int chem, int math, int eng){
        percentage =  (phy+chem+math+eng)/4;

        //creating object for bankAccount
        BankAccount ba = new BankAccount();
        ba.username = "Mohammad Saquib"; //this is possible because public
        System.out.println(ba.username); 
        // ba.password = "adfajlaf"; //password can't be access out side class
        ba.setPassword("jahsdfjk"); //this is possible why because fun is 
        // public and we are setting or changing password not accessing using . operator
    }
}

class BankAccount{
    public String username;//acces averywhere
    private String password;//cant access outside class
    //function
    public void setPassword(String pwd){
        password = pwd;
    }
}