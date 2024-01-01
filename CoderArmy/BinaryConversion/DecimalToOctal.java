public class DecimalToOctal {
    public static void main(String[] args) {
        int n = 76, ocatal = 0, i=1;
        while (n>0) {
            ocatal += (n%8)*i;
            n /= 8;
            i *= 10;
        }
        System.out.println(ocatal);
    }
}
