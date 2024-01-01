public class ConvertSmalToCapital{
    public static char convertSmall(char ch){
        char ans = (char)((int)ch - (int)'a'+ (int)'A');
        return ans;
    }
    public static char convertCapt(char ch){
        char ans = (char)((int)ch - (int)'A' + (int)'a');
        return ans;
    }
    public static void main(String[] args) {
        char ch = 'X';
        System.out.println(convertSmall(ch));
        System.out.println(convertCapt(ch));

    }
}