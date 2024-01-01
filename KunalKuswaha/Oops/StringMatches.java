public class StringMatches {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str.matches("."));
        System.out.println(str.matches("[abc]")); //atmost one of them is true other than false
        System.out.println(str.matches("[^abc]"));
        System.out.println(str.matches("[a-z0-9]"));
        System.out.println(str.matches("[A-Z0-9]"));
        System.out.println(str.matches("[a-z][0-9]"));
        System.out.println(str.matches("[A-Z][0-9]"));
        System.out.println(str.matches("a|b"));
        System.out.println(str.matches("abc"));

        //Meta characters
        // \d(digits), \D(not digits), \s(Not space), \w(alphabet or digit), \W(neither alphabet or digit)
        
        String str1 = "s";
        System.out.println(str1.matches("\\w"));
        System.out.println(str1.matches("\\d"));
        System.out.println(str1.matches("\\D"));
        System.out.println(str1.matches("\\s"));
        System.out.println(str1.matches("\\W"));

        //Quantifires
        // * (0 or more times), + (one or more), ? (0 or one time), {X} (X time), {X,Y} (Between X and Y time)

        String str2 = "abccbaa";
        System.out.println(str2.matches(".*"));
        System.out.println(str2.matches("[a-z]*"));
        System.out.println(str2.matches("[abc]+"));
        System.out.println(str2.matches("[abc]{3,8}"));


    }
}
