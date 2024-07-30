package OOPS.Collection_Frameworks;
import java.util.*;
public class listpart1 {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();   //arraylist extends list

        List<Integer> list2=new ArrayList<>(); //also can be linklist in place of arraylist

        //collection frameworks method
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(1); //to remove this integer pass the object Integer.valueOf(1);        System.out.println(list);

        list2.add(1);
        list2.add(2);
        list2.add(3);


 


        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.contains(200));
//        list.remove(1);
//        list.remove(Integer.valueOf(1));
        list.removeAll(list2);
        list.retainAll(list2);


        //convert list to aray
        Object a[]=list.toArray();
        for(Object e: a)
        {
            Integer temp= (Integer)e;
            System.out.println(e);
        }
        System.out.println(list);

     }
}