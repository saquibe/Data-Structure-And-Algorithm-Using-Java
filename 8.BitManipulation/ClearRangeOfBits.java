public class ClearRangeOfBits {
    public static int clearRangeOfBit(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMast = a|b;
        return n & bitMast;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeOfBit(10, 2, 4));
    }
}
