package DataStructures.Queue;

public class CircularQueue {

    public static void main(String[] args) throws Exception {
        CQueue c = new CQueue(3);
        c.insert(5);
        c.insert(7);
        c.insert(9);
        c.insert(11);

        System.out.println(c.remove());
        System.out.println(c.front());
        c.insert(11);
        c.display();
        System.out.println(c.remove());
        System.out.println(c.remove());
        System.out.println(c.remove());

    }

}

class CQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    int front = 0;
    int size = 0;

    public CQueue(int size) {
        this.data = new int[size];
    }

    public CQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot remove from an Empty Queue");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int front() throws Exception {

        if (isEmpty()) {
            throw new Exception("Empty Queue");
        }
        return data[front];

    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

}
