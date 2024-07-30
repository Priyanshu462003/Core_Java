package Generics_and_Wrapper_class;

public class genericsmethods {


    public static void main(String[] args) {
        printdata("hello");
        printdata(23454);


        genericsmethods obj = new genericsmethods();
        obj.doubleData("1123");
        customclass custom = new customclass();
        obj.doubleData(custom);

    }


    static <E> void printdata(E data) {
        System.out.println(data);
    }
//
//    <E extends Number> void doubleData(E data)    //bounded generic type limit the type of data function can take
//    {
//        System.out.println(data);
//    }


    <E> void doubleData(E data) {
        System.out.println(data);
    }
}
class customclass
{

}
