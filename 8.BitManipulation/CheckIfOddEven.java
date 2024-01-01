// package BitManipulation;

public class CheckIfOddEven {
    public static void OddEven(int n){
        int bitMast = 1;
        if ((bitMast & n) == 0) {
            //even
            System.out.println("Even");
        }else{
            //odd
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        OddEven(3);
        OddEven(4);
        OddEven(9);
        OddEven(12);
        OddEven(15);
        OddEven(20);
        OddEven(21);
        OddEven(30);
    }
}
