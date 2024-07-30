package LOOPS;

import java.util.Scanner;
public class reversewhilebasic{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,digit;
        System.out.print(":Enter the Number:");
        n=sc.nextInt();
        while(n>0)
        {
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;

        }
        System.out.println(rev);
    }
}
