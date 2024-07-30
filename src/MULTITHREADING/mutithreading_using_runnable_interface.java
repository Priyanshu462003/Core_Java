package MULTITHREADING;

public class mutithreading_using_runnable_interface implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<=10;i++)
        {
            System.out.println(i);
           try{Thread.sleep(1000);}
           catch (Exception e)
           {
               System.out.println("delay of 1 second");
           }

        }
    }

    public static void main(String[] args) {
        mutithreading_using_runnable_interface t1= new mutithreading_using_runnable_interface();

        Thread thr=new Thread(t1);
        thr.start();
    }
}
