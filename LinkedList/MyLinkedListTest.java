public class MyLinkedListTest {


    public static void main(String a[]) {

        long NANOSECOND_IN_MILLISECOND = 1000000;
        long startTime = System.nanoTime();

        MyLinkedList ll = new MyLinkedList(10);
        ll.addAtHead(11);
        ll.addAtHead(12);
        ll.addAtHead(13);
        ll.addAtTail(8);
        ll.addAtTail(7);
        ll.addAtIndex(4,9);
        ll.addAtIndex(4,9);
        ll.deleteAtIndex(4);
        ll.printList();

        System.out.print("\n");
        System.out.println("\nTime elapsed: " + (System.nanoTime() - startTime) / NANOSECOND_IN_MILLISECOND + " milliseconds");


    }

}