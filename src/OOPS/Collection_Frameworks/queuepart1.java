package OOPS.Collection_Frameworks;
import java.util.*;
public class queuepart1 {
    public static void main(String[] args) {
       Queue<Integer>  q= new LinkedList();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);


        while(!q.isEmpty()) //jbtk queue empty naa ho
        {
            System.out.println(q.poll());
        }
//
//        System.out.println(q); //print list
//        System.out.println(q.poll());  //remove
//        System.out.println(q);//print list
//        System.out.println(q.peek());
//        System.out.println(q);

    }
}
