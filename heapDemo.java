public class heapDemo
{
    public static void main(String[] args)
    {
        Runtime r = Runtime.getRuntime();
        System.out.println("Max Memory: " + r.maxMemory()/1024/1024);
        System.out.println("Total Memory: " + r.totalMemory()/1024/1024);
        System.out.println("Free Memory: " + r.freeMemory()/1024/1024);
        System.out.println("Consumed Memory: " + (r.totalMemory() - r.freeMemory())/1024/1024);
    }
}