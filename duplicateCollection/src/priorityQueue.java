import java.util.*;
public class priorityQueue<T extends Comparable<T>>{
    private ArrayList<T> prtQue =new ArrayList<T>();

    public void push(T obj)
    {
        if(prtQue.isEmpty())
        {
            prtQue.add(obj);
        }
        else
        {
            for(int i = 0; i< prtQue.size(); i++)
            {
                if(obj.compareTo(prtQue.get(i))<0)
                {

                    prtQue.add(i,obj);
                    return;
                }
            }
            prtQue.add(obj);
        }
    }

    public T pop()
    {
        if(prtQue.isEmpty())
        {
            return null;
        }
        return prtQue.remove(0);
    }

    public int search(T obj)
    {
        int res=Collections.binarySearch(prtQue,obj);
        return res;
    }

    public boolean isEmpty()
    {
        return prtQue.isEmpty();
    }

    @Override
    public String toString() {
        return prtQue.toString();
    }
}
