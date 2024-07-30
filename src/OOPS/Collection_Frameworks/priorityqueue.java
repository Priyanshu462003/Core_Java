package OOPS.Collection_Frameworks;
import  java.util.PriorityQueue;
import java.util.Queue;
public class priorityqueue {
    public static void main(String[] args) {
        System.out.println("priority queue which prioritize minimum elements");

        //priorityqueue opeartion on minimum element
        Queue<Integer> pq=new PriorityQueue<>();
        pq.add(30);
        pq.add(40);
        pq.add(10);
        pq.add(20);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

        //priorityqueue operation on maximum
        System.out.println("priority queue which prioritize maximum elements");
        Queue<Integer> pqu=new PriorityQueue<>((a,b)-> b-a);
        pqu.add(40);
        pqu.add(10);
        pqu.add(20);
        pqu.add(30);
        System.out.println(pqu);
        System.out.println(pqu.poll());
        System.out.println(pqu);
        System.out.println(pqu.poll());
        System.out.println(pqu);

    }
}
