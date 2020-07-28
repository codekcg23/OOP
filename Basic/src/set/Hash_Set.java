package set;

import java.util.ArrayList;
import java.util.HashSet;

public class Hash_Set {
    public static  void main(String[] args){
        // cannot hold duplicate elements
        //no insertion order and position acess

        var set1 = new HashSet<Integer>();

        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);

        set1.remove(10);
        System.out.println(set1);

        // union of sets

        var set2 = new HashSet<Integer>();
        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(90);
        set2.add(80);

        set1.addAll(set2);   // =========== union ==========
        System.out.println(set1);

        set1.retainAll(set2);     //=========== inter section ======
        System.out.println(set1);

        // convert set to list
        var list1 = new ArrayList<Integer>();
        list1.addAll(set1);
        System.out.println(list1);


    }
}
