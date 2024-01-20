public class StackUsingArray {

    private static final int MAX_SIZE = 1000;
    private int top;
    private int[] stackArray;

    
    public StackUsingArray() {
        top = -1;
        stackArray = new int[MAX_SIZE];
    }

    
    public void push(int value) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow: Cannot push element " + value + ". Stack is full.");
            return;
        }

        stackArray[++top] = value;
        System.out.println(value + " pushed to stack");
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow: Cannot pop from an empty stack.");
            return -1; 
        }

        int poppedValue = stackArray[top--];
        System.out.println(poppedValue + " popped from stack");
        return poppedValue;
    }

    
    public boolean isEmpty() {
        return top == -1;
    }

    
    public int size() {
        return top + 1;
    }

    
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return stackArray[top];
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        System.out.println("Pop operation:");
        while (!stack.isEmpty()) {
            stack.pop();
        }
    }
}
