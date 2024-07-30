package EXCEPTIONHANDLING;
import java.util.Scanner;
public class CustomExceptions {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter age");
        try
        {
            int age=s.nextInt();
            if(age>100)
            throw new Exception("my error is this");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}

     class myexception extends Exception{
        public myexception(String message){
            super(message);  //calling parent constructor so that "my error is this can be printed
        }
     }