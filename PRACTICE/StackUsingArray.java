package PRACTICE;

public class StackUsingArray {
    private int maxSize;
    private int top;
    private int[] arrayElem;

    public StackUsingArray(int maxSize) {
        this.maxSize = maxSize;
        this.top = top;
        this.arrayElem = new int[maxSize];
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("stack is full!!");
            return;
        } else {
            top++;
            arrayElem[top] = value;
            System.out.println("Pushed element:" + value);
        }
    }

    private boolean isFull() {
        return top == maxSize - 1;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!");
            return -1;
        } else {
            int poppedElem = arrayElem[top];
            top--;
            return poppedElem;
        }
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("empty stack!!");
            return -1;
        }
        return arrayElem[top];
    }


    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
    }
}
