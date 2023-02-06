import java.io.*;
import java.net.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ApiCall
{
    public static void main(String[] args) throws Exception
    {
        Worker w1=new Worker("https://www.boredapi.com/api/activity?participants=1");
        Worker w2=new Worker("https://randomuser.me/api/");
        Worker w3=new Worker("https://baconipsum.com/api/?type=all-meat&paras=3&start-with-lorem=1&format=json");
        ExecutorService pool= Executors.newFixedThreadPool(3);
        Future<String>w1Return=pool.submit(w1);
        Future<String>w2Return=pool.submit(w2);
        Future<String>w3Return=pool.submit(w3);
        System.out.println(w2Return.get()+"\n\n"+w1Return.get()+"\n\n"+w3Return.get());
        pool.shutdown();
    }
}
class Worker implements Callable<String> {
    private String resData="";
    Worker(String url)
    {
        this.url=url;
    }
    String url;
    public String call()
    {

        try
        {
            resData=getHTML(url);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return resData;

    }


    public String getHTML(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream()))) {
            for (String line; (line = reader.readLine()) != null; ) {
                result.append(line);
            }
        }
        return result.toString();
    }
}








/*Method 2:
public class ApiCall
{
    public static void main(String[] args) throws Exception
    {
        Worker w1=new Worker("https://www.boredapi.com/api/activity?participants=1");
        Worker w2=new Worker("https://randomuser.me/api/");
        Worker w3=new Worker("https://baconipsum.com/api/?type=all-meat&paras=3&start-with-lorem=1&format=json");
        w1.start();
        w2.start();
        w3.start();
        w1.join();
        w2.join();
        w3.join();
        System.out.println(w2.getVal()+"\n\n"+w1.getVal()+"\n\n"+w3.getVal());
    }
}
class Worker extends Thread {
    private String resData="";
    Worker(String url)
    {
        this.url=url;
    }
    String url;
    public void run()
    {

        try
        {
            resData=getHTML(url);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public String getVal()
    {
        return resData;
    }

    public String getHTML(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream()))) {
            for (String line; (line = reader.readLine()) != null; ) {
                result.append(line);
            }
        }
        return result.toString();
    }
}
*/

