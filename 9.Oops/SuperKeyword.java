public class SuperKeyword {
    public static void main(String[] args) {
        Horse hr = new Horse();
        System.out.println(hr.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called....");
    }
}
class Horse extends Animal{
    Horse(){
        super.color = "Brown";
        System.out.println("horse constructor is called");
    }
}