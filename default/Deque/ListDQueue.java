package Deque;

interface DQueueIF {
    boolean isEmpty();
    void addFirst(String data);
    void addLast(String data);
    void removeFirst();
    void removeLast();
    void getFirst();
    void getLast();

}
class ListDQueueNode {
    private String data;
    public ListDQueueNode rlink;
    public ListDQueueNode llink;

    public ListDQueueNode() {
        this.data = null;
        this.rlink = null;
        this.llink = null;
    }
    public ListDQueueNode(String data) {
        this.data = data;
        this.rlink = null;
        this.llink = null;
    }
    public String getData() {
        return this.data;
    }
}
public class ListDQueue implements DQueueIF {
    private ListDQueueNode front;
    private ListDQueueNode rear;

    public ListDQueue() {
        front = null;
        rear = null;
    }
    public boolean isEmpty() {
        return (front == null);
    }
    public void addFirst(String data) {
        ListDQueueNode newNode = new ListDQueueNode(data);
        if(isEmpty()) {
            this.front = newNode;
            this.rear = newNode;
            newNode.rlink = null;
            newNode.llink = null;
        }
        else {
            front.llink = newNode;
            newNode.rlink = front;
            newNode.llink = null;
            front = newNode;
        }
//        System.out.println("Inserted item : " + data);
    }
    public void addLast(String data) {
        ListDQueueNode newNode = new ListDQueueNode(data);
        if(isEmpty()) {
            this.front = newNode;
            this.rear = newNode;
            newNode.rlink = null;
            newNode.llink = null;
        }
        else {
            rear.rlink = newNode;
            newNode.llink = rear;
            newNode.rlink = null;
            rear = newNode;
        }
//        System.out.println("Inserted item : " + data);
    }
    public void removeFirst() {
        if(isEmpty()) {
            System.out.println("Dequeue is Empty!");
            return;
        }
        else {
            String item = front.getData();
            if(front.rlink == null) {
                front = null;
                rear = null;
            }
            else {
                front = front.rlink;
                front.llink = null;
            }
        }
    }
    public void removeLast() {
        if(isEmpty()) {
            System.out.println("Dequeue is Empty!");
            return;
        }
        else {
            String itme = rear.getData();
            if(rear.llink == null) {
                rear = null;
                front = null;
            }
            else {
                rear = rear.llink;
                rear.rlink = null;
            }
        }
    }
    public void getFirst() {
        if(isEmpty()) {
            System.out.println("Dequeue is Empty!");
            return;
        }
        else {
            System.out.println(front.getData());
        }
    }
    public void getLast() {
        if(isEmpty()) {
            System.out.println("Dequeue is Empty!");
            return;
        }
        else {
            System.out.println(rear.getData());
        }
    }
    public void claer() {
        if(isEmpty()) {
            System.out.println("Dequeue is already Empty!");
            return;
        }
        else {
            front = null;
            rear = null;
        }
    }
    public ListDQueueNode searchNode(String data) {
        ListDQueueNode tempNode = this.front;
        while(tempNode != null) {
            if(data.equals(tempNode.getData())) {
                return tempNode;
            }
            else {
                tempNode = tempNode.rlink;
            }
        }
        return tempNode;
    }
    public void printDequeue() {
        ListDQueueNode tempNode = this.front;
        if(isEmpty()) {
            System.out.println("Dequeue is Empty!");
            return;
        }
        else {
            while(tempNode != null) {
                System.out.print(tempNode.getData() + " ");
                tempNode = tempNode.rlink;
            }
            System.out.println();
        }
    }
}
