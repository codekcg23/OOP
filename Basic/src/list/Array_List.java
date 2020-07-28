package list;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
    public static void main(String[] args){
        // object
        ArrayList<String> arr = new ArrayList<>();
     //   List<String> arr1 = new ArrayList();   most suitable
        arr.add("red");     //add
        arr.add("yellow");
        arr.add("orange");

        System.out.println(arr);
        System.out.println(arr.get(0));  //retrieve
        arr.set(0,"pinnk");              //update
        System.out.println(arr);
        arr.remove(arr.get(0));
      //  arr.remove("pink");        by using object
      //  arr.remove(0);             by using index

        System.out.println(arr.indexOf("yellow")); //first match
    //   arr.clear();
        System.out.println(arr);
        System.out.println(arr.contains("pink"));

        // sub list
        List<String> arr2 = arr.subList(1,2);
        System.out.println(arr2);

        System.out.println(arr.size());
        System.out.println(arr.isEmpty());

        System.out.println("List==========");
        for(String x : arr){
            System.out.println(x);
        }

    }

}
// list can have duplicates