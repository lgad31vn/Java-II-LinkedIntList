public class LinkedIntList {
    private ListNode front;
    private int size;
    public LinkedIntList(){
        front=null;
        size=0;
    }

    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            //find the end of the list
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            //current is on last node
            current.next = new ListNode(value);
        }
        size++;
    }

    //append this node to the end
    public void add(ListNode node) {
        if (front == null) {
            front = node;
        } else {
            //find the end of the list
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            //current is on last node
            current.next = node;
        }
        size++;
    }
    //problem 22
    public void changeAllNums(int value) {
        if (front == null) {
            throw new IllegalStateException();
        }
        ListNode current = front;
        while (current != null) {
            current.data = value;
            current = current.next;
        }
    }
    //problem 23 - change the last node to store the value
    public void changeLastNode(int value) {
        if (front == null) {
            throw new IllegalStateException();
        }
        ListNode current = front;
        while (current.next != null) {

            current = current.next;
        }
        current.data = value;
    }
    //problem 24
    public void addNodeEnd(int value) {
        add(value);
    }

    //problem 25 - find Min
    public int min() {
        if (front==null) {
            throw new IllegalStateException();
        }
        int min = Integer.MAX_VALUE;
        ListNode current = front;

        while(current.next != null) {
            if (current.data < min) {
                min = current.data ;
            }
            current = current.next;

        }

        return min;
    }

    //problem 25 - find Max
    public int max() {
        int max = Integer.MIN_VALUE;
        ListNode current = front;

        while (current.next != null){
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }


    public String toString(){
        if (front == null) {
            return "[ ]";
        }
        String result="[" + front.data;

        //go through the rest of the list
        ListNode current = front.next;
        while(current != null) {
            result += ", " +current.data;
            current = current.next;
        }

        return result +"]";

    }
}







