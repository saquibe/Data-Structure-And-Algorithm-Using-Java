public class KadanesAlgoMaxSubArraySum {
    public static void kadanes(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            currSum = currSum+number[i];
            if (currSum<0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Our max sub array sum is : "+maxSum);
    }
    public static void main(String[] args) {
        int number[] = {-1,-2,-3,-4,-6};
        kadanes(number);
    }
}
