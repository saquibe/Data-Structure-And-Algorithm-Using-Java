public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breadth();
        shark.color = "black";
        System.out.println(shark.color);        
    }
}
//base class or parent class
class Animal{
    String color;
    void eat(){
        System.out.println("Animals are eating");
    }
    void breadth(){
        System.out.println("Animals are breadthing");
    }
}
//derived class or child class which have all fun and prop of parent + own prop
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("fish are swiming");
    }
}