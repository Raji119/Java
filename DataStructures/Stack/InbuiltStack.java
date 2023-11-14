package DataStructures.Stack;

import java.util.Stack;

public class InbuiltStack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(6);
        st.push(7);

        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);

    }

}
