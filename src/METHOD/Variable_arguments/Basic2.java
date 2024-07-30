package METHOD.Variable_arguments;
public class Basic2 {
    static void name(String ...s)
    {
        for(int i=0;i<s.length;i++)
        {
            System.out.println(i+1+". "+s[i]);
        }
    }
    public static void main(String... args) {//{Choice([]/...)}
        name("Honey","kashyap","Priyanshu");
    }
}

