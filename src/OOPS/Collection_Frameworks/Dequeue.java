package OOPS.Collection_Frameworks;
import java.util.*;

//in case of queue use offer peeek and poll
public class Dequeue {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offer(10); //ye
        dq.offerLast(20);  //ye same
        dq.offerFirst(30);

        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq.pollLast());
        System.out.println(dq);
    }
}
