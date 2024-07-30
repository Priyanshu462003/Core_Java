package Conditional;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int yrs;
        System.out.print("Enter the Year to Check year is Leap Or Not:");
        yrs=sc.nextInt();
        if(yrs%4==0)
        {
            if(yrs%100==0)
            {
                if(yrs%400==0)
                {
                    System.out.println("This is Leap year");
                }
                else
                {
                    System.out.println("This is Not Leap year");
                }
            }
            else
            {
                System.out.println("This is a Leap year");
            }
        }
        else{
            System.out.println("This is Not a Leap year");
        }
    }
}