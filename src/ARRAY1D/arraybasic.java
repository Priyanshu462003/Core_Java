package ARRAY1D;

public class arraybasic {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5};
        int b[]=new int [3];
        A[1]=9;
        // for(int i=0;i<A.length;i++)
        // {
        //     System.out.println(A[i]);
        // }
        // System.out.println("Other");
        //
        for(int x:A)
        {
            System.out.println(x);
        }
        System.out.println("Other");
        //
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]++);
        }
        System.out.println("<+1>");
        for(int k:A)
        {
            System.out.println(k);
        }
    }
}
