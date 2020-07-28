package map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Map_Iterating {
    public static  void main(String [] args){
        var map1 = new TreeMap<Integer,Double>();

        map1.put(10,Math.sqrt(10));
        map1.put(20,Math.sqrt(20));
        map1.put(30,Math.sqrt(30));
        map1.put(40,Math.sqrt(40));

        for(Map.Entry<Integer,Double> e: map1.entrySet()){
            System.out.println(e);
        }

       Iterator itr = map1.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
