public class PrintSubArrays {
    public static void subArray(int number[]){
        int totalSubArr = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k]+" ");
                }
                System.out.println();
                totalSubArr++;
            }
            System.out.println();
        }
        System.out.print("Total sub array : "+totalSubArr);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        subArray(number);
    }
}
