package Conditional;

import java.util.Scanner;
class ifelse
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x;
        System.out.println("enter a number");
        x=s.nextInt();
        if(x<0)
            System.out.println("number is negative");
        else
            System.out.println("number is positive");
    }
}