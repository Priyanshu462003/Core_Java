package EXCEPTIONHANDLING;

public class finallyblock {
    public static void main(String[] args) {
        int[] a= new int[5];
        System.out.println("heloo");
        try
        {
            System.out.println(a[8]);
        }
        catch(Exception e)
        {
            System.out.println("exception handled");
        }
        finally {
            System.out.println("runs always doesnt matter if exception is there or not");
        }
        System.out.println("bye");

//
//        try
//        {
//            System.out.println([8]);
//        }
//        finally {
//            System.out.println("runs always doesnt matter if exception is there or not");
//        }



    }
}
