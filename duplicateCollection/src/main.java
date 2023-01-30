public class main {
    public static void main(String[] Args)
    {
//        fakeStack<Integer>st=new fakeStack<Integer>();
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        while (!st.empty())
//        {
//            System.out.println(st.pop());
//        }
        priorityQueue<String> pq=new priorityQueue<>();
        pq.push("Pavan");
        pq.push("Kushal");
        pq.push("Sai");
        pq.push("Dasari");
        pq.push("Eramilli");
        pq.search("Pavan");
        System.out.println(pq.search("Pavan"));
    }
}
