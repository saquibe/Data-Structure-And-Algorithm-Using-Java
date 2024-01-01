public class CountSort {
    public static void countSort(int arr[]){
        int larget = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            larget = Math.max(larget, arr[i]);
        }
        int count[] = new int[larget+1];
        for (int i = 0; i < count.length; i++) {
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,1,2,3,1,1,2,5,7,6,5,7,4,3,4,5,2,3};
        countSort(arr);
        printArr(arr);
    }
}
