package METHOD.methodfunction;

public class ObjectMethodModify {
    static void change(int a[])
    {
        a[0]=245;
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        System.out.println("Array Object Before change");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        //
        change(a);
        System.out.println("");
        System.out.println("Array Object After change");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
