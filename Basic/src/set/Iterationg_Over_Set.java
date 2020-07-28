package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterationg_Over_Set {
    public static  void main(String [] args) {

        Set<Integer> set1= new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);

        for(int x: set1){
            System.out.println(x);
        }
        Iterator itr1 = set1.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }

}
