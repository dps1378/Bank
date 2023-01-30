import java.util.*;

public class fakeStack<T>
{
    private ArrayList<T> stk=new ArrayList<T>();

    public boolean push(T element)
    {
        return stk.add(element);
    }

    public T pop()
    {
        return stk.remove(stk.size()-1);
    }

    public T peek()
    {
        return stk.get(stk.size()-1);
    }

    public boolean empty()
    {
        return stk.isEmpty();
    }

    @Override
    public String toString() {
        return stk.toString();
    }

    public int search(T obj)
    {
        int count=0;
        for(int i=stk.size()-1;i>=0;i--)
        {
            if(stk.get(i).equals(obj))
            {
                return count;
            }
            count++;
        }
        return -1;
    }
}
