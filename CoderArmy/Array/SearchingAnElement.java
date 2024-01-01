public class SearchingAnElement {
    public static int searchElementAtIndx(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key is found at indx");
                return i;
            }
        }
        System.out.println("key is not found");
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {6,4,7,9,6,3};
        int key = 9;
        System.out.println(searchElementAtIndx(arr, key));
    }
}
