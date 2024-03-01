class Solution{
    //to print data recursively
    public static void displayr(Node head){
        //base case
        if (head == null) {
            return;
        }
        System.out.println(head.data);
        displayr(head.next);
    }
    public static class Node {
        int data;
        Node next;
        
        Node(int data){ //constructor
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(42);
        Node c = new Node(62);
        Node d = new Node(22);
        Node e = new Node(72);
        //connect all node
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayr(a);
    }
}