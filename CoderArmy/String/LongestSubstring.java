public class LongestSubstring {
    public static int longestString(String s){
        int count[] = new int[128];
        for(char ch : s.toCharArray()){
            count[ch]++;
        }
        int first = 0, second = 0, len = 0;
        while (second <
         s.length()) {
            while (count[s.charAt(second)]) {
                
            }
        }
    }
    public static void main(String[] args) {
        String str = "abcdekABCElai";
    }
}
