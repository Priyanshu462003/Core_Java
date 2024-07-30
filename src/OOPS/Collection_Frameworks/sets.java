package OOPS.Collection_Frameworks;

import java.util.HashSet;
import java.util.Set;
public class sets
{
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(10); //set does not support duplicate elements and put elemnt in random order
        set.add(10);
        set.add(20);
        set.remove(10);
        System.out.println(set);
    }
}
