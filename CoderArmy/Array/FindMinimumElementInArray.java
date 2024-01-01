public class FindMinimumElementInArray {
    public static int findMin(int arr[]){
        int lowest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (lowest > arr[i]) {
                lowest = arr[i];
            }
        }
        return lowest;
    }
    public static void main(String[] args) {
        int arr[] = {4,7,8,3,1,9,5};
        System.out.println(findMin(arr));
    }
}
