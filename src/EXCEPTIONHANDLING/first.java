package EXCEPTIONHANDLING;

public class first {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("hello");

//        try {
//           int res=5/0;
//            System.out.println(a[9]);
//        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("array index out of size bound");
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("can't devide number by zero");
//            System.out.println(e.getMessage());
//            System.out.println(e.getStackTrace()); //kis line s exception ana start hua
//            System.out.println(e);
//        }


        try {
            int res=5/0;
            System.out.println(a[9]);
        }
//        catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
//        {
//            System.out.println("handling the exceptuion");
//        }
         catch(Exception e)
         {
             System.out.println("handling all type of exception at one go");
         }
        System.out.println("bye");
    }


}
