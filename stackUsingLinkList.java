class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

class Stack {
    Node top;

    public Stack() {
        top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(data + " pushed to stack.");
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            int poppedValue = top.data;
            top = top.next;
            return poppedValue;
        }
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return top.data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            Node current = top;
            System.out.print("Stack: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

public class stackUsingLinkList {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.printStack();

        System.out.println("Popped Value: " + stack.pop());
        System.out.println("Popped Value: " + stack.pop());

        System.out.println("Top Value: " + stack.peek());

        stack.printStack();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
