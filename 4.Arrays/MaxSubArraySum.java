public class MaxSubArraySum {
    public static void getMaxSum(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += number[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.print("Max sum is : "+maxSum);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16};
        getMaxSum(number);
    }
}
