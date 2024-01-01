// package FunctionAndMethod;

public class helloWorld {
    public static void printHelloWorld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
    public static void main(String[] args) {
        printHelloWorld();
    }
}


// Java Methods
// A method is a block of code that performs a specific task.

// Suppose you need to create a program to create a circle and color it. You can create two methods to solve this problem:

// a method to draw the circle
// a method to color the circle
// Dividing a complex problem into smaller chunks makes your program easy to understand and reusable.

// In Java, there are two types of methods:

// User-defined Methods: We can create our own method based on our requirements.
// Standard Library Methods: These are built-in methods in Java that are available to use.
// Let's first learn about user-defined methods.

// Declaring a Java Method
// The syntax to declare a method is:

// returnType methodName() {
//   // method body
// }
// Here,

// returnType - It specifies what type of value a method returns For example if a method has an int return type then it returns an integer value.

// If the method does not return a value, its return type is void.
// methodName - It is an identifier that is used to refer to the particular method in a program.
// method body - It includes the programming statements that are used to perform some tasks. The method body is enclosed inside the curly braces { }.
// For example,

// int addNumbers() {
// // code
// }
// In the above example, the name of the method is adddNumbers(). And, the return type is int. We will learn more about return types later in this tutorial.

// This is the simple syntax of declaring a method. However, the complete syntax of declaring a method is

// modifier static returnType nameOfMethod (parameter1, parameter2, ...) {
//   // method body
// }
// Here,

// modifier - It defines access types whether the method is public, private, and so on. To learn more, visit Java Access Specifier.
// static - If we use the static keyword, it can be accessed without creating objects.

// For example, the sqrt() method of standard Math class is static. Hence, we can directly call Math.sqrt() without creating an instance of Math class.
// parameter1/parameter2 - These are values passed to a method. We can pass any number of arguments to a method.
// Calling a Method in Java
// In the above example, we have declared a method named addNumbers(). Now, to use the method, we need to call it.

// Here's is how we can call the addNumbers() method.

// // calls the method
// addNumbers();
