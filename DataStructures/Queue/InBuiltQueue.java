package DataStructures.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(7);
        q.add(5);

        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
    }

}
