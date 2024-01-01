public class SelectionSort {
    public static void selSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int indx = i;
            for(int j = i+1; j<arr.length-1; j++){
                if(arr[j] < arr[indx]){
                    indx = j;
                }
            }
            //swap;
            int temp = arr[indx];
            arr[indx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void print(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int arr[] = {7,9,5,3,4,6,1,2};

        System.out.println("Befor sorting ");
        print(arr);
        System.out.println("After sorting ");
        selSort(arr);
        print(arr);
    }
}
