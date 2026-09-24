package day59;

import java.util.Stack;

public class BasicOfStacks {
    static void main(String[] args) {
        Stack<String> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st.size());

        st.push("amir");
        System.out.println(st.peek());
        System.out.println(st.size());
        st.push("khan");
        st.push("Ali");
        st.push("Lala");
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
    }
}
