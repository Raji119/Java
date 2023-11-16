package DataStructures.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class InBuiltDeQue {

    public static void main(String[] args) {

        Deque<Integer> d = new ArrayDeque<>();

        d.add(5);
        d.add(7);
        d.add(9);
        d.addFirst(11);
        d.addLast(11);

        System.out.println(d);
        System.out.println(d.remove());
        System.out.println(d.removeLast());
        System.out.println(d.removeFirst());

    }

}
