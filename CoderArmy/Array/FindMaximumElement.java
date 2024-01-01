public class FindMaximumElement {
    public static int largestElem(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {5,7,9,23,65,4,67,87};
        System.out.println(largestElem(arr));
    }
}
