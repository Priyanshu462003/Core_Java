package LOOPS;
import java.util.Scanner;
public class loopbasic {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the Number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }

        //
        for(int k=10;k>0;k--)
        {
            System.out.println(k);
        }

    }
}

