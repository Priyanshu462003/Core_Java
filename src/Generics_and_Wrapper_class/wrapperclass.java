package Generics_and_Wrapper_class;

public class wrapperclass {
    public static void main(String[] args) {
        Integer obj1=new Integer(12);
        //or
        Integer obj2=Integer.valueOf(12);
        //or
        Integer obj3=12;  //autoboxing
        int age= obj1;   //unboxing
        System.out.println(obj2*4);

        Boolean myboolean=new Boolean(false);

    }
}
