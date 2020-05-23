package Queue;

interface Queue{
    boolean isEmpty();
    boolean isFull();
    void enqueue(char item);
    char dequeue();
    char peek();
    void clear();
}
public class ArrayQueue {
    private int front;
    private int rear;
    private int queueSize;
    private char queueArr[];

    public ArrayQueue(int size) {
        front = -1;
        rear = -1;
        this.queueSize = size;
        queueArr = new char[this.queueSize];
    }
    public boolean isEmpty() {
        if(front == rear) {
            front = -1;
            rear = -1;
        }
        return (front == rear);
    }
    public boolean isFull() {
        return (rear == this.queueSize - 1);
    }

    public void enqueue(char item) {
        if(isFull()) {
            System.out.println("Queue is Full!");
        }
        else {
            queueArr[++rear] = item;
//            System.out.println("Inserted item : " + item);
        }
    }
    public char dequeue() {
        if(isEmpty()) {
            System.out.println(/*"Deleting Fail!, */"Queue is Empty!");
            return 0;
        }
        else {
            System.out.println("Deleted item : " + queueArr[front + 1]);
            front = (front + 1) % this.queueSize;
            return queueArr[front];
        }
    }
    public char peek() {
        if(isEmpty()) {
            System.out.println(/*"Queueing Fail!, */"Queue is Empty!");
            return 0;
        }
        else {
            System.out.println("Queued item :" + queueArr[front + 1]);
            return queueArr[front + 1];
        }
    }
    public void clear() {
        if (isEmpty()) {
            System.out.println("Queue is already Empty!");
        } else {
            front = -1;
            rear = -1;
            queueArr = new char[this.queueSize];
            System.out.println("Queue is Clear!");
        }
    }
    public void printQueue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty!");
        }
        else {
            System.out.print("Queue elements : ");
            for(int i = front + 1; i <= rear; i++) {
                System.out.print(queueArr[i] + " ");
            }
            System.out.println();
        }
    }
}
