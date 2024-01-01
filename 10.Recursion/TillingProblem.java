//given a 2xn board and tiles of size is 2x1 count the number of a way to tile the given board 
//using 2x1 tiles (a tile either can be placed horizontally or vertically)
public class TillingProblem {
    public static int tilingProblem(int n){// 2xn board size
    //base case
    if (n==0 || n==1) {
        return 1;
    }

    //kaam

    //vertical choice
    int fnm1 = tilingProblem(n-1);
    //horizontal choice
    int fnm2 = tilingProblem(n-2);
     
    int totalWays = fnm1+fnm2;

    return totalWays;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingProblem(n));        
    }
}
