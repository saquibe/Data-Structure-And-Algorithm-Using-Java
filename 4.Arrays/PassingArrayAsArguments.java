public class PassingArrayAsArguments{
    public static void arrayMehtod(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks [] ={83,74,84,93};
        arrayMehtod(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");            
        }
    }
}