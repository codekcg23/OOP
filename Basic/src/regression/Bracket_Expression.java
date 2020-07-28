package regression;

public class Bracket_Expression {
    public static  void main(String [] args){
        String str1 = "cat";
        String patt = "[cbmh]at";
      //  String str2 = str1.replaceAll(patt,"");
        System.out.println(str1.matches(patt));

    }
}
// [] inside brackets options includes
//   [A-Z0-9] [a-z] [0-9]  // any rang using -
// ^ everything apart from inside bracket  opposite
// {n}  n instances
// "a(b|c)"  or opearion
//  dot operator  -  "ABC."   after ABC it can be any one single character
// "ABC,*"  after ABC anything can be there
