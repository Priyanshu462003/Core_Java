package METHODOVERLOADING;

public class methodoverloadingbasic{
    static int max(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }
    }

    static float max(float x,float y)
    {
        if(x>y)
        {
            return x;
        }
        else{
            return y;
        }
    }

    public static void main(String[] args) {
        int a=5,b=45;
        float x=2.2f,y=5.6f;
        int k=max(a,b);
        float l=max(x,y);
        System.out.println(k);
        System.out.println(l);

    }
}
