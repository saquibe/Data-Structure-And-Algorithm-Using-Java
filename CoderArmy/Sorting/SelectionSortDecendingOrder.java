public class SelectionSortDecendingOrder{
    public static void selSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int indx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[indx]) {
                    indx = j;   
                }
            }
            //swap
            int temp = arr[indx];
            arr[indx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void print(int arr[]){
        for (int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,7,9,8,1,3,4,2,6};
        print(arr);
        selSort(arr);
        print(arr);
    }
}