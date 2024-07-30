package MULTITHREADING;

public class usingThreadclass extends  Thread{
    @Override
    public void run() {
        for (int i=1;i<=10;i++)
        {
            System.out.println(i);
            try{Thread.sleep(2000);}
            catch (Exception e)
            {
                System.out.println("delay of 1 second");
            }

        }
    }

    public static void main(String[] args) {
      usingThreadclass thred=new usingThreadclass();
      thred.start();

    }
}
