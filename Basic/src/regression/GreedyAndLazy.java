package regression;

public class GreedyAndLazy {
    public static  void main(String [] args){
        String str1 = "+1---567--()9087";
        String patt = "[A-Za-z0-9]";
     //   String str2 = str1.replaceAll(patt,"");
        System.out.println(str1.matches(patt));



    }
}
/*
*     * - Greedy  *? - non greedy
*      + - Greedy  +? - non greedy
*       {} greedy     {}?  non greedy
 */

//  www.ucsc.lk

//  "www\\.ucsc\\.lk"