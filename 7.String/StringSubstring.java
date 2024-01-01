public class StringSubstring {
    public static String printSubstring(String str, int si, int ei){
        String subString = "";
        for (int i = si; i < ei-1; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(printSubstring(str, 0,4));
    }
}
