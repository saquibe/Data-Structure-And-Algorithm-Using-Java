public class SetIthBit {
    public static int setithBit(int n, int i){
        int bitMast = 1<<i;
        return n | bitMast;
    }
    public static void main(String[] args) {
        System.out.println(setithBit(10, 2));
    }
}
