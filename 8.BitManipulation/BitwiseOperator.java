// package BitManipulation;

public class BitwiseOperator {
    public static void main(String[] args) {
        //binary AND(&)
        System.out.println(5 & 6);  //5=101, 6=110 (rule only bot 1,1 then 1 otherwise 0)
        //binary OR(|)
        System.out.println(5 | 6);
        //XOR (^)
        System.out.println(5 ^ 6);
        //binary one's complement (~)
        System.out.println(~0);
        System.out.println(~1);
        System.out.println(~3);
        System.out.println(~10);
        //left shift(<<) in this multiply by two
        System.out.println(10<<1); //left shifting 10 by one it gives 20
        System.out.println(10<<2);
        System.out.println(-10<<1);
        //right shift (>>) in this divide by two
        System.out.println(10>>1);
        System.out.println(10>>2);
    }
}
