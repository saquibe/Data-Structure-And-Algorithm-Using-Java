//print all binary string of size N without consecutive ones
public class BinaryString{
    public static void printBinaryString(int n, int lastPlace, String str){
        if (n==0) { //base case
            System.out.println(str);
            return;
        }
        //kaam
        printBinaryString(n-1, 0, str+"0");
        if (lastPlace==0) {
            printBinaryString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinaryString(10, 0, "");
    }
}