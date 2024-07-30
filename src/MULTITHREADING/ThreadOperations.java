package MULTITHREADING;

public class ThreadOperations {
    public static void main(String[] args) {
        System.out.println("program started....");

        int x=56+34;
        System.out.println("sum is "+x);
           //Thread
       Thread t = Thread.currentThread();
       String tname=t.getName();
        System.out.println("current thread running is ="+ tname);
        //rename thread
        t.setName("Mymain");
        System.out.println("new name = "+t.getName());

        System.out.println("program ended..");

    }
}
