package Conditional;
import java.util.Scanner;
public class youngcheck {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int age;
            System.out.print("Enter the Age:");
            age=sc.nextInt();
            if(age>=14 && age<=55)
            {
                System.out.println(age+" age young");
            }
            else{
                System.out.println(age+" age not a young");
            }

        }
    }

