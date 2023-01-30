import java.util.*;
public class priority_queue <T extends Comparable<T>>{
    private ArrayList<T> pri_que=new ArrayList<T>();
    public void push(T obj)
    {
        if(pri_que.isEmpty())
        {
            pri_que.add(obj);
        }
        else
        {
            for(int i=0;i<pri_que.size();i++)
            {
                if(obj.compareTo(pri_que.get(i))<0)
                {

                    pri_que.add(i,obj);
                    return;
                }
            }
            pri_que.add(obj);
        }
    }
    public T pop()
    {
        if(pri_que.isEmpty())
        {
            return null;
        }
        return pri_que.remove(0);
    }
    public int search(T obj)
    {
        int res=Collections.binarySearch(pri_que,obj);
        return res;
    }
    public boolean isEmpty()
    {
        return pri_que.isEmpty();
    }
    @Override
    public String toString() {
        return pri_que.toString();
    }
}
