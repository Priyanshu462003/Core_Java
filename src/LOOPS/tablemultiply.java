package LOOPS;

import java.util.Scanner;
public class tablemultiply {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the number:");
        n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            // n=n*i;
            System.out.println(n+"X"+i+"="+n*i);
        }
    }
}

