package map;

import java.util.TreeMap;

public class Tree_Map {
    public static  void main(String [] args){
        // red black tree concept
        // keys are sorted by default
        // put,get,containskey,containsValue,keyset,entryset,values

        var map1 = new TreeMap<Character,Integer>();

        map1.put('a',10);
        map1.put('c',40);
        map1.put('b',20);
        System.out.println(map1);
        map1.replace('a',1000);  // update can use put too

        // firstEntry,LastEntry
        // LastKey, firstKey
        // pollFirstEntry , pollLastEntry  get and remove



    }
}
