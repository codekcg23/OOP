package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {

    public static void main(String[] args){
        // object
        ArrayList<String> arr = new ArrayList<>();
        //   List<String> arr1 = new ArrayList();
        arr.add("red");     //add
        arr.add("yellow");
        arr.add(null);
        arr.add("orange");

        ListIterator itr = arr.listIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        // hasPrevious  nextPrevious   reverse order iterator
        System.out.println("List==========");
        for(String x : arr){
            System.out.println(x);
        }


        // program to remove null values
        while(itr.hasNext()){
            if(itr.next() == null){
                itr.remove();
              //  itr.set(0);
            }
        }
        System.out.println(arr);

    }

}
