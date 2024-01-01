public class FucntionOverriding {
    public static void main(String[] args) {
        Dear dr = new Dear();
        dr.eat();
    }
}
class Anumals{
    void eat(){
        System.out.println("eat anyting");
    }
}
class Dear extends Anumals{
    void eat(){
        System.out.println("eat gross");
    }
}