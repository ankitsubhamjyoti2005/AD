public class Queue {
    private int[] array;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element.");
            return;
        }

        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;

        System.out.println("Enqueued: " + item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1; // Return a default value or throw an exception to indicate error
        }

        int dequeued = array[front];
        front = (front + 1) % capacity;
        size--;

        System.out.println("Dequeued: " + dequeued);
        return dequeued;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return -1; // Return a default value or throw an exception to indicate error
        }

        return array[front];
    }
}
public class Queue_IN_ARR {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Size: " + queue.size());
        System.out.println("Front: " + queue.front());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("Size: " + queue.size());
        System.out.println("Front: " + queue.front());
    }
}


[01/02, 8:51 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/8514811
[01/02, 8:51 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/9569098
[01/02, 8:51 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/9473673
[01/02, 8:52 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/10059647
[01/02, 8:53 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/9043195
[01/02, 8:53 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/9367546
[01/02, 8:55 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/10000702
[01/02, 8:55 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/9415247
[01/02, 8:56 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/9448848
[01/02, 8:56 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/9060143
[01/02, 8:56 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/10118666
[01/02, 8:56 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/10041341
[01/02, 8:56 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/9662572
[01/02, 8:57 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/9322323
[01/02, 9:10 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/10003233
[01/02, 9:11 am] Ankit Subhamjyoti: https://ieeexplore.ieee.org/document/7800363