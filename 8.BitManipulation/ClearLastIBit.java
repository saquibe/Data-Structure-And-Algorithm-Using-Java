public class ClearLastIBit {
    public static int clearIbit(int n, int i){
        int bitMast = (~0)<<i;
        return n & bitMast;
    }
    public static void main(String[] args) {
        System.out.println(clearIbit(15, 2));
    }
}
