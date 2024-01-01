public class PairsInArray {
    public static void printPairs(int number[]){
        int totalPairs = 0;
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];
            for (int j = i+1; j < number.length; j++) {
                System.out.print("("+curr+","+number[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.print("Total pairs is : "+totalPairs);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14};
        printPairs(number);
    }
}
