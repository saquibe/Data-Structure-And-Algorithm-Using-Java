public class InsertinSrot {
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    //swp
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    }
                    else{
                        break;
                    }
                }
            }
        }

        public static void print(int arr[]){
            for (int x : arr) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        int arr[] = {7,3,5,2,9,1};
        print(arr);
        insertionSort(arr);
        print(arr);
    }
}

//time complexity
//worst case: O(n*n)
//best case: O(n)