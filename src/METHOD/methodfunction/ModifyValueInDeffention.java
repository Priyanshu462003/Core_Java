
package METHOD.methodfunction;

public class ModifyValueInDeffention {
    static void  newValue(int a)
    {
        a++;
        System.out.println(a+" value in Method(Deffention)");
    }
    public static void main(String[] args) {
        int a=10;
        System.out.println(a+" value in Main");
        newValue(a);

    }
}
