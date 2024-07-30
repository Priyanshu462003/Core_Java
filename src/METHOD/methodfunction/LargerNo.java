package METHOD.methodfunction;

// public class LargerNo {
//     static int max(int x,int y)
//     {
//         if(x>y)
//         {
//             return x;
//         }
//         else{
//             return y;
//         }
//     }
//     public static void main(String args[])
//     {
//         int x=10,y=20,c;
//         c=max(x,y);.

//         System.out.println(c+" is the Larger Number");
//     }
// }

/// Other Method Without include static in Deffention;
///
public class LargerNo {
    int max(int x,int y)
    {
        if(x>y)
        {
            return x;
        }
        else{
            return y;
        }
    }
    public static void main(String args[])
    {
        LargerNo p=new LargerNo(); // this is important
        int x=10,y=20,c;
        c=p.max(x,y);

        System.out.println(c+" is the Larger Number");
    }
}


