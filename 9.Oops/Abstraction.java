public class Abstraction {
    public static void main(String[] args) {
        Horse hr = new Horse();
        hr.eat();
        hr.walk();
        
        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();
        System.out.println(ch.color);
        
    }
}
abstract class Animal{ //abstract class object can't created of animal
    String color;
    Animal(){ //this is constructor
        color = "Brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk(); //abstract method this must be override in sub classes
}
class Horse extends Animal{
    void changeColor(){
        color = "Dark Brown";
    }
    void walk(){ //redefining or overriding the abstract method
        System.out.println("hours walk on four legs");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color = "Red";
    }
    void walk(){
        System.out.println("chiken are walk on two leg");
    }
}