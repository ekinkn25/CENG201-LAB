/**
 * DeleteMiddleDemo.java
 *
 * Tests deleting the middle node of a singly linked list.
 *
 * Name:        Ekin Karıncalı
 * Student ID:  230446019
 * Date:        12.10.2026
 */

public class DeleteMiddleDemo {

    public static void main(String[] args) {

        System.out.println("=== Delete Middle Node Demo ===");
        System.out.println();

        // Test 1: Odd number of nodes

        // 1. Created a singlyLinkedList
        SinglyLinkedList singlyLinkedList3 = new SinglyLinkedList();

        // 2. Add 1,2,3,4,5 Nodes to the list
        singlyLinkedList3.add(1);
        singlyLinkedList3.add(2);
        singlyLinkedList3.add(3);
        singlyLinkedList3.add(4);
        singlyLinkedList3.add(5);
        
        // 3. Display the list
        System.out.println("Original List 1:");
        singlyLinkedList3.display();

        // 4. Delete the Middle Node
        singlyLinkedList3.deleteMiddle();

        // 5. Display the list after deleting
        System.out.println("After deleting middle:");
        singlyLinkedList3.display();

        System.out.println();



        // -------------------------------------------------------
        // Test 2: Even number of nodes
        // 1. Created another singlyLİnkedList
        SinglyLinkedList singlyLinkedList4 = new SinglyLinkedList();

        // 2. Add 10,20,30,40,50,60 Nodes to the list
        singlyLinkedList4.add(10);
        singlyLinkedList4.add(20);
        singlyLinkedList4.add(30);
        singlyLinkedList4.add(40);
        singlyLinkedList4.add(50);
        singlyLinkedList4.add(60);

        // 3. Display the list
        System.out.println("Original List 2:");
        singlyLinkedList4.display();

        // 4. Delete the Middle Node
        singlyLinkedList4.deleteMiddle();

        // 5. Display the list after deleting
        System.out.println("After deleting middle:");
        singlyLinkedList4.display();

        System.out.println();

        // Test 3: One node
        // 1. Created another singlyLİnkedList
        SinglyLinkedList singlyLinkedList5 = new SinglyLinkedList();

        // 2. Add just 999 to the list
        singlyLinkedList5.add(999);

        // 3. Display the list
        System.out.println("Original List 3:");
        singlyLinkedList5.display();

        // 4. Delete the Middle Node (because it has just one node, you just have to delete the head)
        System.out.println("After deleting middle:");
        singlyLinkedList5.deleteMiddle();

        // 5. Display the list after deleting
        singlyLinkedList5.display();

    }
}
