package DataStructures.Queue;

public class QueueMain {

    public static void main(String[] args) {

        CustomQueue que = new CustomQueue();
        que.insert(5);
        que.insert(7);

        try {
            System.out.println(que.front());
            System.out.println(que.remove());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
