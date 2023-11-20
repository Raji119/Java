package DataStructures.Queue;

import java.util.Stack;

public class RemoveEfficientQueueUsingStacks {

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
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(x);
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    public int pop() {
        return first.pop();
    }

    public int peek() {
        return first.peek();
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
