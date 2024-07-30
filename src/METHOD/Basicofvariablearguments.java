package METHOD;

public class Basicofvariablearguments {
    static void show(int ...a)//{this ... make a array}
    {
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        show(1,2,3,4,5,6,7,8,9,0);
    }
}

