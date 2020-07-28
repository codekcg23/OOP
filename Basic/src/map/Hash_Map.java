package map;

import java.util.HashMap;

public class Hash_Map {
    public static  void main(String [] args){

        // key value pair in java

        var map1 = new HashMap<Integer,String>();

        map1.put(1,"jan");  // add keys and values to map
        map1.put(2,"feb");
        map1.put(3,"mar");

        System.out.println(map1.get(1));
        System.out.println(map1.get(90));  // null value if not exist
        System.out.println(map1.containsKey(3));
        map1.put(3,"apr");

       // map1.remove(1);
       // map1.remove(2,"feb");

        var set1 = map1.keySet();  // retrive keys
        System.out.println(set1);
        var set2 = map1.entrySet();
        System.out.println(set2);


    }
}
