public class HybridInheritance{
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.color="white";
        doggy.leg = 4;
        System.out.println(doggy.color);
        System.out.println(doggy.leg);
        doggy.bark();
        doggy.breadth();
        doggy.eat();
        
        Human hm = new Human();
        hm.color = "brown";
        System.out.println(hm.color);
        hm.leg = 2;
        System.out.println(hm.leg);
        hm.breadth();
        hm.eat();
        hm.think();

        Bird bd = new Bird();
        bd.color = "so many color";
        System.out.println(bd.color);
        bd.breadth();
        bd.eat();
        bd.fly();

        Fish fsh = new Fish();
        fsh.color = "so many color";
        System.out.println(fsh.color);
        fsh.breadth();
        fsh.eat();
        fsh.swim();

    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("Animal are eating");
    }
    void breadth(){
        System.out.println("Animal are breadthing");
    } 
}
class Mammal extends Animal{
    int leg;
}
class Dog extends Mammal{
    void bark(){
        System.out.println("Dogs are bark");
    }
}
class Human extends Mammal{
    void think(){
        System.out.println("Human can think");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Birds can fly");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("fish can swim");
    }
}