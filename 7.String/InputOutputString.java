// import java.util.Scanner;

public class InputOutputString {
    public static void printLetter(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name : ");
        // String name = sc.next(); //this takes only one word like saquib
        // String name = sc.nextLine(); //this takes whole para  
        // System.out.println(name);

        //to find length of string
        // System.out.println("Length is : "+name.length());

        //concatenation we can add two strings
        String firstName = "mohammad";
        String lastName = "saquib";
        String fullName = firstName+" "+lastName;


        printLetter(fullName);



        //to print all letter of string



        // System.out.println(fullName);
        // sc.close(); 
    }
}
