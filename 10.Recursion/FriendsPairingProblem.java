//given n friends each one remain single or can be paired up with some other friend. Each friend
//can be paired only once. Find out total number of ways in which friends can remain single or 
//can be paired up
public class FriendsPairingProblem {
    public static int friendsPairing(int n){
        if (n==1 || n==2) {
            return n;
        }
        //sigle choice
        int fnm1 = friendsPairing(n-1);
        //paired choice
        int fnm2 = (n-1)*friendsPairing(n-2);

        int totalWays = fnm1+fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendsPairing(n));
    }
}
