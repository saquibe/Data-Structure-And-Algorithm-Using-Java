public class SumOfAllElementOfAnArray {
    public static int sumArray(int arr[]){
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum = sum + arr[i];
        // }
        // return sum;

        //using for each loop

        int sum = 0;
        for (int x : arr) {
            sum = sum + x;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {3,6,8,9,4,6,7,3};
        System.out.println(sumArray(arr));
    }
}
