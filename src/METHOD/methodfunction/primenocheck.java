package METHOD.methodfunction;
    import java.util.Scanner;
    public class primenocheck  {
        static boolean prime(int n)
        {
            for(int i=2;i<n/2;i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;

        }

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n;
            boolean c;
            System.out.print("Enter the Number:");
            n=sc.nextInt();
            c=prime(n);
            System.out.println(c);


        }
    }


