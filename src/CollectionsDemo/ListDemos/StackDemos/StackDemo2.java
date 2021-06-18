package CollectionsDemo.ListDemos.StackDemos;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<String> st = new Stack<>();


        st.push("amol");
        st.push("rahul");
        st.push("ravi");
        st.push("sudhir");
        st.push("Jitendra");

        System.out.println(st.search("amol"));



    }
}
