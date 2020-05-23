package Queue;

interface QueueIF {
    boolean isEmpty();
    boolean isFull();
    void enqueue(String data);
    void dequeue();
    void peek();
    void clear();
}
class ListQueueNode {
    private String data;
    public ListQueueNode link;

    public ListQueueNode() {
        this.data = null;
        this.link = null;
    }
    public ListQueueNode(String data) {
        this.data = data;
        this.link = null;
    }
    public ListQueueNode(String data, ListQueueNode link) {
        this.data = data;
        this.link = link;
    }
    public String getData() {
        return this.data;
    }
}
public class ListQueue implements QueueIF {
    private ListQueueNode head;
    private ListQueueNode front;
    private ListQueueNode rear;
    private int queueSize;

    public ListQueue(int size) {
        head = null;
        front = null;
        rear = null;
        this.queueSize = size;
    }
    public boolean isEmpty() {
        return (front == null && rear == null);
    }
    public boolean isFull() {
        if(isEmpty()) {
            return false;
        }
        else {
            int countNode = 0;
            ListQueueNode tempNode = head;
            while(tempNode.link != null) {
                ++countNode;
                tempNode = tempNode.link;
            }
            return (this.queueSize - 1 == countNode);
        }
    }
    public void enqueue(String data) {
        ListQueueNode newNode = new ListQueueNode(data);
        if(isFull()) {
            System.out.println("Queue is Full!");
            return;
        }
        if(isEmpty()) {
            this.head = newNode;
            this.front = this.head;
            this.rear = this.head;
        }
        else {
            rear.link = newNode;
            rear = newNode;
        }
    }
    public void dequeue() {
        ListQueueNode tempNode;
        if(isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        if(front.link == null) {
            head = null;
            front = null;
            rear = null;
        }
        else {
            tempNode = front.link;
            head = tempNode;
            front.link = null;
            front = head;
        }
    }
    public void peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        else {
            System.out.println(front.getData());
        }
    }
    public void clear() {
        if(isEmpty()) {
            System.out.println("Queue is already Empty!");
            return;
        }
        else {
            head = null;
            front = null;
            rear = null;
        }
    }
    public ListQueueNode searchNode(String data) {
        ListQueueNode tempNode = this.front;
        while(tempNode != null) {
            if(data.equals(tempNode.getData())) {
                return tempNode;
            }
            else {
                tempNode = tempNode.link;
            }
        }
        return tempNode;
    }
    public void printListQueue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        else {
            ListQueueNode tempNode = this.front;
            while(tempNode != null) {
                System.out.print(tempNode.getData() + " ");
                tempNode = tempNode.link;
            }
            System.out.println();
        }
    }
}
