/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Your Name:        Ekin Karıncalı
 * Your Student ID:  230446019
 * Your Date:        12.10.2026
 */

public class SinglyLinkedList {

    // Instance variable
    private Node head;

    // Constructor
    public SinglyLinkedList() {
        head = null;
    }


    // Add a node to the end of the list
    public void add(int data) {
        // 1. Create a new Node.
        Node newNode = new Node(data);

        // 2. If the list is empty, make the new node the head.
        if (head == null){
            head = newNode;
            return;
        }

        // 3. Otherwise, traverse to the last node.
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }

        // 4. Link the last node to the new node.
        currentNode.next = newNode;
    }


    // -------------------------------------------------------
    // Display the linked list
    public void display() {
        // Start from head.
        Node currentNode = head;

        while (currentNode != null){
            // Print the data values
            System.out.print(currentNode.data + " --> ");

            // Visit each node using next
            currentNode = currentNode.next; 
        }
        System.out.println("NULL");
    }


    // -------------------------------------------------------
    // Find the middle node
    public Node findMiddle() {
        if (head == null){
            return null;
        }

        int lengthOfList = 0;
        Node currentNode = head;

        while(currentNode != null){
            lengthOfList++; 
            currentNode = currentNode.next;
        }

        int middleIndex = lengthOfList / 2;

        // baştan tekrar bakarak gidiyoruz middle index değerimize gelene kadar index arttırıyoruz
        //middle index kadar adım atıyoruz yani iki adım atarsak 0->1->2 indexe varmış olduk 
        currentNode = head;
        for (int index = 0; index < middleIndex; index++){
            currentNode = currentNode.next;
        }
        return currentNode;
    }


    // -------------------------------------------------------
    // Delete the middle node
    public void deleteMiddle() {
        if (head == null){
            return;
        }

        int lengthOfList = 0;
        Node currentNode = head;

        // Step 1: Count the total number of nodes.
        while(currentNode != null){
            lengthOfList++; 
            currentNode = currentNode.next;
        }

        //If there is only one node, the list becomes empty.
        if (lengthOfList == 1) {
            head = null;
            return;
        }

        // Step 2: Find the node before the middle node.
        //         Then change its next reference so that
        //         the middle node is removed from the list.
        int middleIndex = lengthOfList / 2;
        int beforeTheMiddleIndex = middleIndex -1;
        
        currentNode = head;
        for (int index = 0; index < beforeTheMiddleIndex; index++){currentNode = currentNode.next;}
        currentNode.next = currentNode.next.next;
    }

    // -------------------------------------------------------
    // Get the head
    public Node getHead() {
        return head;
    }
}

