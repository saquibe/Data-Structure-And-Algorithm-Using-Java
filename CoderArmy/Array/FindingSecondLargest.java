public class FindingSecondLargest {
    public static int secondLargest(int arr[]){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int arr[] = {5,7,9,1,3,2,6,7,8};
        System.out.println(secondLargest(arr));
    }
}
