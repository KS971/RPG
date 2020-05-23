package Stack;

interface Stack<T> {
    boolean isEmpty();
    boolean isFull();
    void push(T item);
    T pop();
    T peek();
    void clear();
}
public class ArrayStack<T> implements Stack<T> {
    private int top;
    private int stackSize;
    private T stackArr[];

    public ArrayStack(int size) {
        top = -1;
        this.stackSize = size;
        stackArr = (T[])new Object[this.stackSize];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == this.stackSize - 1);
    }
    public void push(T item) {
        if(isFull()) {
            System.out.println("Stack is Full!");
        }
        else {
            stackArr[++top] = item;
//            System.out.println("Inserted item : " + item);
        }
    }
    public T pop() {
        int rIdx;
        if(isEmpty()) {
            System.out.println(/*"Deleting Fail!, */"Stack is Empty!");
//            return 0;
        }
            rIdx = this.top;
            this.top--;
//        else {
//            System.out.println("Deleted item : " + stackArr[top]);
//            return stackArr[--top];
//        }
        return stackArr[rIdx]; // <<
    }
    public T peek() {
        if(isEmpty()) {
            System.out.println(/*"Peeking Fail!, */"Stack is Empty!");
//            return 0;
        }
//        else {
            System.out.println("Peeked item : " + stackArr[top]);
//            return stackArr[top];
//        }
        return stackArr[top]; // <<
    }
    public void clear() {
        if(isEmpty()) {
            System.out.println("Stack is already Empty!");
        }
        else {
            top = -1;
            stackArr = (T[])new Object[this.stackSize];
            System.out.println("Stack is Clear!");
        }
    }
    public void printStack() {
        if(isEmpty()) {
            System.out.println("Stack is Empty!");
        }
        else {
            System.out.print("Stack elements : ");
            for(int i = 0; i <= top; i++) {
                System.out.print(stackArr[i] + " ");
            }
            System.out.println();
        }
    }
}
