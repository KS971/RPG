package List;

class CircularNode {
    private String data;
    public CircularNode link;

    public CircularNode() {
        this.data = null;
        this.link = null;
    }
    public CircularNode(String data) {
        this.data = data;
        this.link = null;
    }
    public CircularNode(String data, CircularNode link) {
        this.data = data;
        this.link = link;
    }
    public String getData() {
        return this.data;
    }
}
public class CircularLinkedList {
    private CircularNode head;
    private int size;

    public CircularLinkedList() {
        head = null;
        size = 0;
    }
    public void insertFirstNode(String data) {
        CircularNode newNode = new CircularNode(data);
        if (head == null) {
            head = newNode;
            head.link = head;
        } else {
            CircularNode tempNode = head;
            while (tempNode.link != head) { //
                tempNode = tempNode.link;
            }
            newNode.link = tempNode.link;
            head = newNode;
            tempNode.link = newNode;
        }
        size++;
    }
    public void insertMidNode(String data, CircularNode pre) {
        CircularNode newNode = new CircularNode(data);
        newNode.link = pre.link;
        pre.link = newNode;
        size++;
    }
    public void insertLastNode(String data) {
        CircularNode newNode = new CircularNode(data);
        if(head == null) {
            head = newNode;
            newNode.link = newNode;
        }
        else {
            CircularNode tempNode = head;
            while(tempNode.link != head) {
                tempNode = tempNode.link;
            }
            tempNode.link = newNode;
            newNode.link = head;
        }
        size++;
    }
    public void deleteNode() {
        CircularNode pre, temp;
        if(head == null)
            return;
        if(head.link == null) {
            head = null;
        }
        else {
            pre = head;
            temp = head.link;
            while(temp.link != head) {
                pre = temp;
                temp = temp.link;
            }
            pre.link = head; //?
        }
        size--;
    }
    public CircularNode searchNode(String data) {
        CircularNode tempNode = head;
        if(head == null) {
            System.out.println("List is Empty!");
            return tempNode;
        }
        else {
            while(tempNode.link != head) {
                if(data.equals(tempNode.getData())) {
                    return tempNode;
                }
                else {
                    tempNode = tempNode.link;
                }
            }
            return tempNode;
        }
    }
    public void printList() {
        CircularNode tempNode = head;
        if(head == null) {
            System.out.println("List is Empty!");
            return;
        }
        if(tempNode.link == head) {
            System.out.print(tempNode.getData() + " ");
        }
        else {
            while (tempNode.link != head) {
                System.out.print(tempNode.getData() + " ");
                tempNode = tempNode.link;
        }
            System.out.println();
    }
}
    public void getSize() {
        System.out.println(this.size);
    }
}
