/**
 * TokenStack.java
 *
 * Your Name:        Ekin Karıncalı
 * Your Student ID:  230446019
 * Your Date:        26.10.2026
 */

public class TokenStack {

    private class Node {
        // create the instant named data as a String type
        String data;

        // create the next pointer that will be used for the Stack implementation as a Node type
        Node next;

        // cpmplete the constructor accordinally
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // create the top pointer that will be used for the Stack implementation as private
    private Node top;

    public TokenStack() {
        // create the constructor of the TokenStack class that will assigned the top pointer to null
        top = null;
    }

    public void push(String value) {
        // TODO: Create a new node.
        //       Connect it to the current top.
        //       Update top.
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        // TODO: Check whether the stack is empty.
        //       Store the top value.
        //       Move top to the next node.
        //       Return the stored value.
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }

        String x = top.data;
        top = top.next;
        return x;
    }

    public boolean isEmpty() {
        // TODO: Return whether the stack is empty.
        return top == null;
    }
}
