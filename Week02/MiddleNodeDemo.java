/**
 * MiddleNodeDemo.java
 *
 * Tests the singly linked list and findMiddle() method.
 *
 * Name:        Ekin Karıncalı
 * Student ID:  230446019
 * Date:        12.10.2026
 */

public class MiddleNodeDemo {

    public static void main(String[] args) {

        System.out.println("=== Find Middle Node Demo ===");
        System.out.println();

        // -------------------------------------------------------
        // Test 1: Odd number of nodes
        // 1. Created a singlyLİnkedList
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        // 2. Add 1,2,3,4,5 Nodes to the list
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.add(5);
                
        // 3. Display the list
        System.out.println("List 1:");
        singlyLinkedList.display();

        // 4. Found and print the middle Node
        System.out.println("Middle Node: " + singlyLinkedList.findMiddle().data);
        System.out.println();

        // -------------------------------------------------------
        // Test 2: Even number of nodes
        // 1. Created another singlyLİnkedList
        SinglyLinkedList singlyLinkedList2 = new SinglyLinkedList();

        // 2. Add 10,20,30,40,50,60 Nodes to the list
        singlyLinkedList2.add(10);
        singlyLinkedList2.add(20);
        singlyLinkedList2.add(30);
        singlyLinkedList2.add(40);
        singlyLinkedList2.add(50);
        singlyLinkedList2.add(60);

        // 3. Display the list
        System.out.println("List 2:");
        singlyLinkedList2.display();

        // 4. Found and print the middle Node
        System.out.println("Middle Node: " + singlyLinkedList2.findMiddle().data);
        System.out.println();
    }
}
