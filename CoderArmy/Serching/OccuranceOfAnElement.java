public class OccuranceOfAnElement {
    public static int occuranceElement(int arr[], int target){
        int n = arr.length; int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,7,7,7,7,9};
        int target = 7;
        System.out.println(occuranceElement(arr, target));
    }
}
