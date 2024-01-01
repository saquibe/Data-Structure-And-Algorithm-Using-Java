public class WrapperExample {
    public static void main(String[] args) {
        // int a = 20;

        Integer num = 74;

        // final A student = new A("saquib");
        // student.name = "other name";

        //when a non premitive is final, you cannot reassign it
        // student = new A("new object");
    }

    class A{
        final int a =10;
        String name;

        public A(String name){
            this.name = name;
        }
    }
}
