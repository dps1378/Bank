public class Main {
    public static void main(String[] Args)
    {
//        fake_stack<Integer>st=new fake_stack<Integer>();
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        while (!st.empty())
//        {
//            System.out.println(st.pop());
//        }
        priority_queue<String> pq=new priority_queue<>();
        pq.push("Pavan");
        pq.push("Kushal");
        pq.push("Sai");
        pq.push("Dasari");
        pq.push("Eramilli");
        System.out.println(pq);
        while (!pq.isEmpty())
        {
            System.out.println(pq.pop());
        }
    }
}
