package regression;

public class Character_Classes {
    /*
    * \d - match single digit
    * \w - single word
    * \s - single whitepase
    * \D - match single  non digit character
    * \W - match a single  non digit and non word character
     */
    // \ = escape character
public static  void  main(String[] args) {
    String str = "0716008664";  // any seven digits
    String patt = "071\\d{7}";
    System.out.println(str.matches(patt));
}

}
