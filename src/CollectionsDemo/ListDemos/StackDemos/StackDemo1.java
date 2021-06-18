package CollectionsDemo.ListDemos.StackDemos;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<String> st = new Stack<>();
        System.out.println(st.empty()); // true

        st.push("amol");
        st.push("rahul");
        st.push("ravi");
        st.push("sudhir");
        st.push("Jitendra");
        System.out.println(st.empty()); // false
        System.out.println(st);

        System.out.println(st.pop());
        System.out.println(st);

        System.out.println(st.pop());
        System.out.println(st);

        System.out.println(st.pop());
        System.out.println(st);

        System.out.println(st.peek());
        System.out.println(st);


    }
}
