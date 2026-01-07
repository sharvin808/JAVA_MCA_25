class SearchThread extends Thread
{
    int[] arr;
    int start,end,key;
    SearchThread(int[] arr, int start, int end, int key)
    {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.key = key;
    }
    public void run()
    {
        for(int i = start;i < end;i++)
        {
            if(arr[i] == key)
            {
                System.out.println("Element found at index "+i+" by thread "+Thread.currentThread().getName());
            }
        }
    }
}

public class Program_28 
{
    public static void main(String args[])
    {
        int[] arr =  {10,20,30,40,50,60,70,80,90,100};
        int n = arr.length;
        int key = 70;
        int numThreads = n / 5;
        int chunk = n / numThreads;
        for(int i = 0;i < numThreads;i++)
        {
            int start = i * chunk;
            int end = Math.min(start + chunk, n);
            SearchThread t = new SearchThread(arr, start, end, key);
            t.start();
        }
    }
}
