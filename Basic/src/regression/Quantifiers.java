package regression;

public class Quantifiers {
    public static  void main(String [] args){
        //String str1 = "+1---567--()9087";
      //  String patt = "[A-Za-z0-9]";
       // String str2 = str1.replaceAll(patt,"");
        String str1 = "abxyz";
       // String patt = "abc*";  // repititive c
       // String patt = "abc+";  // at least once  c
       // String patt = "abc?";  // optional c  0 or 1 instances
       // String patt = "ab(xyz)?";  // optional block
        String patt = "abc(xyz){2}";  // exact 2 blocks repeting  of xyz
        System.out.println(str1.matches(patt));

        // () represent block of character
        // {2,6}  range of block repeting
        // {n,}  //minimum n or more instances

    }
}
