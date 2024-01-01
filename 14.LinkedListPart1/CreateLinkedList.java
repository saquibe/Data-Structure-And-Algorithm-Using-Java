public class CreateLinkedList {
    public static class Node{ //this is node class
        int data;
        Node next; 

        public Node(int data){ //this is constructor
            this.data = data;
            this.next = null;
        }
    }
    public static Node head; //first node of the linked list
    public static Node tail; //last node of the linked list
    public static int size; //to count the size of linked list

    //methods

    //add();
    //remove();
    //print();
    //search();

    //writing addFirst method
    public void addFirst(int data){
        //step 1 creating new node
        Node newNode = new Node(data);
        size++;

        //if my linkedList is empty
        if (head == null) {
            head=tail=newNode;
            return;
        }
        //step2 linking node
        newNode.next = head;

        //step3
        head = newNode;
    }

    //writing method to add Node in last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //writing function to print linkedList
    public void print(){
        if (head==null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //writing method to node in the mid
    public void addMid(int indx, int data){
        if (indx==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < indx-1) {
            temp = temp.next;
            i++;
        }
        //i = indx-1 , temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //to remove first node in ll
    public int removeFirst(){
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size == 1) {
            int val = head.data;
            head=tail=null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //To remove last node
    public int removeLast(){
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size == 1) {
            int val = head.data;
            head=tail=null;
            size = 0;
            return val;
        }
        //prev: i=size-2
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //Search Iterative
    //Search for a key in linked list return the postive where it is found if not found return -1

    public int iterativeSearch(int key){ //time complexity O(n)
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { //key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        //key not found
        return -1;
    }

    //Reverse Linked List
    public void reverse(){ // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //delete Nth node from last
    public void delNthNodeFromLast(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n==sz) {
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //Detect loop or cycle in a linked list or Floyd's cycle

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2

            if (slow==fast) {
                return true; //cycle exist
            }
        }
        return false; //cycle does not exist
    }

    //Removing cycle from linked list
    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null; //last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle
        prev.next = null;
    }

    
    public static void main(String[] args) {
        // CreateLinkedList ll = new CreateLinkedList();
        
        // ll.print();
        // ll.addFirst(3);
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        
        // ll.addLast(4);
        // ll.print();
        // ll.addLast(5);

        // ll.addMid(2, 9);

        // ll.print();

        // System.out.println(ll.size);

        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.iterativeSearch(3));
        // System.out.println(ll.iterativeSearch(7));

        // ll.print();
        // ll.reverse();
        // ll.print();

        // ll.print();
        // ll.delNthNodeFromLast(3);
        // ll.print(); 

        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;
        //1->2->3->1
        // System.out.println(isCycle());


        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;
        System.out.println(isCycle()); //cheking cycle formed or not
        removeCycle(); //is cycle exist remove cycle
        System.out.println(isCycle()); //now existing cycle removed

    }
}
