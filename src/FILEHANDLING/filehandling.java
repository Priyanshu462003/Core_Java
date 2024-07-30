package FILEHANDLING;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class filehandling
{
    public static void main(String[] args) {

         List<String> fruits=new ArrayList<>();

         fruits.add("kiwi");
         fruits.add("papaya");
         fruits.add("mango");
         fruits.add("apple");
         //iterate in list

        //method 1
         for(int i=0; i<fruits.size(); i++)
         {
             System.out.println("fruit is"+ fruits.get(i));

         }

         //methid 2
        for(String fruit: fruits)
        {
            System.out.println("for each fruit "+fruit);

        }

        //method3
        Iterator<String> fe=fruits.iterator();
        while(fe.hasNext()) {
            System.out.println("iterator " + fe.next());

        }

        List<String>  smalllist=fruits.subList(1,3);
        System.out.println(smalllist);
    }

}
