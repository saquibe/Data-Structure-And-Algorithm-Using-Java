public class UpdateIthBit{
    public static int setithBit(int n, int i){
        int bitMast = 1<<i;
        return n | bitMast;
    }
    public static int clearIthBit(int n, int i){
        int bitMast = ~(1<<i);
        return n & bitMast;
    }
    public static int updatIthBit(int n, int i, int newBit){
        // if (newBit==0) {
        //     return clearIthBit(n, i);
        // }else{
        //     return setithBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bittMask = newBit<<i;
        return n|bittMask;
    }
    public static void main(String[] args) {
        System.out.println(updatIthBit(10, 2, 1));
    }
}