// get ith bit
public class IthBit {
    public static int ithBit(int n, int i){
        int bitMast = 1<<i;
        if (((n & bitMast) == 0)) {
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(ithBit(10, 2));
    }
}
