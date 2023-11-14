package DataStructures.Stack;

public class StackMain {

    public static void main(String[] args) {
        CustomStack st = new CustomStack();
        st.push(5);
        st.push(10);

        System.out.println(st);
        try {
            System.out.println(st.peek());
            System.out.println(st.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
