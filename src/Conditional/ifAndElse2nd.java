package Conditional;

import java.util.Scanner;

public class ifAndElse2nd {
    public static void main(String[] args) {
        {
            int a,b,c;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the value of 1st number:");
            a=sc.nextInt();
            System.out.print("Enter the value of 2nd number:");
            b=sc.nextInt();
            System.out.print("Enter the value of 3rd number:");
            c=sc.nextInt();
            if (a>b && a>c)
            {
                System.out.println(a+" is the largest");
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
}
