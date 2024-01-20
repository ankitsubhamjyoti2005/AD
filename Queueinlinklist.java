public class Queueinlinklist {

    private Node front; 
    private Node rear; 

    
    private static class Node {
        int data; 
        Node next; 

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public Queueinlinklist() {
        front = null;
        rear = null;
    }
  
    
    public boolean isEmpty() {
        return front == null;
    }
  
    
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            
            rear.next = newNode;
            rear = newNode;
        }
    }
  
    
    public int dequeue() {
        
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        
        int dequeuedData = front.data;
        front = front.next;

        
        if (front == null) {
            rear = null;
        }

        return dequeuedData;
    }
  
   
    public int peek() {
        
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return front.data;
    }

    
    public void display() {
        
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queueinlinklist queue = new Queueinlinklist();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display(); 

        System.out.println("Front element: " + queue.peek()); // 10

        queue.dequeue();
        
        queue.display(); 
        
        System.out.println("Front element: " + queue.peek()); // 20
    }
}
