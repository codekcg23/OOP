package list;

import java.util.LinkedList;

public class Link_List {
    public  static  void main(String[] args){
        // not adjusnt random location use pointers to link
        // head => null
        var li = new LinkedList<Double>();
        li.add(1.1);
        li.add(1.4);
        li.add(0.9);

        System.out.println(li.get(1));
        li.set(2,2.3);
        System.out.println(li);

        //li.clear()
        //li.remove(0);
        //li.remove(1.1)

        li.add(1,0.8)   ;      //insert in between
        System.out.println(li);
        System.out.println(li.peekFirst());    // give head
        System.out.println(li.peekLast());      // give head
        System.out.println(li.pollFirst());  //give head and remove it
        System.out.println(li.pollLast());   // give tail and remove it
    }
}
