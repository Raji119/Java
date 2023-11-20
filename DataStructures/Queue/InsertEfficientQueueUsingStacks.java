package DataStructures.Queue;

import java.util.Stack;

public class InsertEfficientQueueUsingStacks {

    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.push(5);
        q.push(7);
        q.push(9);

        System.out.println(q.pop());
        System.out.println(q.peek());

    }
}

class MyQueue {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;

    }

    public boolean empty() {
        return first.isEmpty();
    }
}
