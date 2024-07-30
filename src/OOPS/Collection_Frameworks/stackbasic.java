package OOPS.Collection_Frameworks;

import java.util.ArrayDeque;

public class stackbasic
{
    public static void main(String[] args) {
        ArrayDeque<Integer> stack= new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        ArrayDeque<Integer> queue=new ArrayDeque();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

    }
}
