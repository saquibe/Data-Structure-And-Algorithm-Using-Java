//find missing and repeating in array in given range
public class FindMissingAndRepeating {
    public static void missingRepeating(int arr[]){
        int n = arr.length;
        int count[] = new int[n];
        for (int i = 0; i < n; i++) {
            count[arr[i]-1]++;
        }
        //missing
        for (int i = 0; i < n; i++) {
            if (count[i] == 0) {
                System.out.println("Missing Number: "+ (i+1));
                break;
            }
        }
        //repeating number
        for (int i = 0; i < n; i++) {
            if (count[i]==2) {
                System.out.println("Repeating Number: "+ (i+1));
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,1,2,7,6};

        missingRepeating(arr);
    }
}
//time complexity: O(N)
//space complexity: O(N)