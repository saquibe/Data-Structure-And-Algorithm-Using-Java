// package CoderArmy.TwoPointer;
//segregate zero and one using two pointer approach

public class Segregate_0and_1_TwoPointer {
    public static void solution(int arr[]){
        int start = 0, end = arr.length-1;
        while (start < end) {
            if (arr[start] == 0) {
                start++;
            }else{
                if (arr[end] == 0) {
                    int temp = arr[end];
                    arr[end] = arr[start];
                    arr[start] = temp;
                }else{
                    end--;
                }
            }
        }
    }

    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,1,0,0,1};

        solution(arr);
        print(arr);
    }
}

//time complexity: O(n)
