//Find and print all subset of string
public class FindSubset{
    public static void findSubset(String str, String ans, int i){
        //base case
        if (i==str.length()) {
            if (ans.length()==0) {
                System.out.print("null");
            }else{
                System.out.print(ans+" ");
            }
            return;
        }

        //recursion yes choice
        findSubset(str, ans+str.charAt(i), i+1);
        //no choice
        findSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
}

//time complexity O(n*pow(2,n))
//space complexity O(n)