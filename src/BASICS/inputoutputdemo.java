package BASICS;


import java.util.Scanner; // importing scanner class from util package
    public class inputoutputdemo
    {
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in); //making object of scanner class and calling
            int roll;
            long phone;//use whn int range xceeds
            float cgpa;
            double marks;
            String name; //making objecs you can also declare String name;
            System.out.println("enter name, roll number,phone,cgpa,marks ");
            name=s.nextLine();
            roll=s.nextInt();
            phone=s.nextLong();
            cgpa=s.nextFloat();
            marks=s.nextDouble();

            //44 s.close(); // otherwise warning is there "resource s is never closed" this is because some resource(memory) is being lost or wasted
            System.out.println("name="+name);
            System.out.println("roll number="+roll);
            System.out.println("cgpa="+cgpa);
            System.out.println("marks="+marks);
            System.out.println("phone number="+phone);
        }
    }


