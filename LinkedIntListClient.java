public class LinkedIntListClient {
    public static void main(String[] args){
        //construct LinkedIntList
        LinkedIntList list = new LinkedIntList();

        list.add(new ListNode(42));
        list.add(new ListNode(67));
        list.add(5);
        list.add(85);

//        list.changeAllNums(42);
        list.changeLastNode(999);
        list.addNodeEnd(42);


        System.out.println(list.min());
        System.out.println(list.max());
        System.out.println(list.toString());

    }
}
