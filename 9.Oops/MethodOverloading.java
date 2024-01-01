public class MethodOverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("sum of two no : "+cal.sum(5, 7));
        System.out.println("Sum of two float number : "+cal.sum(5.6f, 4.6f));
        System.out.println("Sum of three number is : "+cal.sum(6, 4, 7));
    }
}
class Calculator{
    public int sum(int a, int b){
        return a+b;
    }
    public float sum(float x, float y){
        return x+y;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
}
