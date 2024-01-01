public class Practice {
    // public static String sortSentence(String s) {
    //     String [] words = s.split(" ");
    //     String [] ans = new String[9];
    //     int count = 0;
    //     for(int i = 0; i < words.length; i++){
    //         int pos = words[i].charAt(words[i].length()-1)-'0';
    //         ans[pos-1] = words[i].substring(0, words[i].length()-1)+" ";
    //         count++;
    //     }
    //     s = "";
    //     for(int i = 0; i < count; i++){
    //         s += ans[i];
    //     }
    //     return s.substring(0, s.length()-1);
    // }
    public static void main(String[] args) {
        String str = "Java Programming";
        System.out.println(str);

        char ch[] = {'a','b','e','f','o'};
        String str1 = new String(ch);
        System.out.println(str1);

        byte b[] = {65,76,86,98,75,70};
        String str2 = new String(b);
        System.out.println(str2);
        
    }
}
