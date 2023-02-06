import java.io.*;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApiCall
{
    private static String sol="";

    public static void setSol(String sol) {
        ApiCall.sol =ApiCall.sol.concat(sol);
        ApiCall.sol=ApiCall.sol.concat("\n\n");
    }

    public static void main(String[] args) throws Exception
    {
        Worker w1=new Worker("https://www.boredapi.com/api/activity?participants=1");
        Worker w2=new Worker("https://randomuser.me/api/");
        Worker w3=new Worker("https://baconipsum.com/api/?type=all-meat&paras=3&start-with-lorem=1&format=json");
        ExecutorService pool= Executors.newFixedThreadPool(3);
        pool.execute(w1);
        pool.execute(w2);
        pool.execute(w3);
        pool.shutdown();
        while (!pool.isTerminated()){};
        System.out.println(sol);
    }
}
class Worker extends Thread {
    Worker(String url)
    {
        this.url=url;
    }
    String url;
    public void run()
    {
        String resData="";
        try{
            resData=getHTML(url);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        merge(resData);
    }
    static synchronized void merge(String str)
    {
        ApiCall.setSol(str);
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
