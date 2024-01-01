public class GetterSetterMethod {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        
        p1.setTip(7);
        System.out.println(p1.getTip());

        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        p1.setTip(8);
        System.out.println(p1.getTip());
    }
}
class Pen{
    private String color;
    private int tip;
    void setColor(String newColor){ //setter method to access private member to set value
        color = newColor;
    }
    String getColor(){ //getter method to get value 
        return this.color; //this refers to current object
    }
    void setTip(int newTip){
        tip = newTip;
    }
    int getTip(){
        return this.tip;
    }
}
