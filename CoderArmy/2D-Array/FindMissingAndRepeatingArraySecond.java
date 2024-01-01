//find missing and repeating array best approach
public class FindMissingAndRepeatingArraySecond {
    public static void missingRepeating(int arr[]){
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[arr[i]%arr.length] += arr.length;
        }
        //missing number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]/arr.length == 0) {
                System.out.println("Missing Number: "+ (i+1));
                break;
            }
        }
        //repeating number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]/arr.length == 2) {
                System.out.println("Repeating Number: "+ (i+1));
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,6,7,2,3,1,2};

        missingRepeating(arr);
    }
}
//time complexity: O(N)
//space complexity: O(1)