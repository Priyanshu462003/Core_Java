package Conditional;

import java.util.Scanner;

public class ladderIfElse {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        a=sc.nextInt();
        System.out.print("Enter the 2st number:");
        b=sc.nextInt();
        System.out.print("Enter the 3rd number:");
        c=sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is largest");
            }
            else{
                System.out.println(c+" is the largest");
            }
        }
        else
        if (b>c)
        {
            System.out.println(b+" is the largest");
        }
        else
        {
            System.out.println(c+" is the largest");
        }
    }

}

