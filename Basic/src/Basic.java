import java.util.Scanner;

public class Basic {
    public static void main(String[] args){

        System.out.println("Enter your user name : ");
        int var1 = 3;
        Scanner myObj  = new Scanner(System.in);
        String name;
        name = myObj.nextLine();   //read user input
        System.out.println("Username is " + name);
        String var2 = "  Hey " ;
        String var3 = "bye";
        System.out.println("concat: " + var2.concat(var3));
        System.out.println("trim: " + var2.trim());
        System.out.println("length: " + var2.length());
        System.out.println(" upper case: " + var2.toUpperCase());
        System.out.println("lower case: " + var2.toLowerCase());
        System.out.println(" is empty: " + var2.isEmpty());

        // string compare

        System.out.println(" Compare " + var2.equals(var3));
        System.out.println(" Compare case" + var2.equalsIgnoreCase(var3));
        System.out.println(" Compare to" + var2.compareTo(var3));
        System.out.println(" Compare ignore to" + var2.compareToIgnoreCase(var3));
        String pattern = "[A-Z]{1,}";  //regression pattern
        System.out.println(" regression patern" + var2.matches(pattern));

        // string search

        String str1 = "My name is Kavishka";
        String str2 = "kavishka";
        System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));
        System.out.println(str1.startsWith("ka"));
        System.out.println(str1.endsWith("ka"));
        System.out.println(str1.indexOf("kavishka"));
        System.out.println(str1.lastIndexOf("kavishka"));

        //string slice
        // reverse a string

        str1 = "ABCD";
        System.out.println(str1.charAt(3));
        String temp ="";
        for(int i=0;i<str1.length();i++){
            temp = str1.charAt(i) + temp;
            System.out.println("temp = "+temp);
        }
        System.out.println("temp = "+temp);

        // sub string

        System.out.println("substring = "+str1.substring(2));
        System.out.println("substring = "+str1.substring(1,3)); //end index not included

        str2 = "A=B=C=D";
        String str3 = "=";
        String [] arr = str1.split(str3);
        System.out.println("split = " + arr[0]);
        for (String x : arr){
            System.out.println(x);
        }

        //string replace

        str1 = "hey123 123456";
        str3 = "123";
        System.out.println(str1.replace(str3,"you"));
        String str4 = "123#$/fggggggg-=%&*";
        pattern = "[^A-Za-z0-9\\a]"; // //a = remove spaces
        System.out.println(str4.replaceAll(pattern,""));

        // string operation

        int num1 = 100;
        System.out.println(Integer.toString(num1));
        System.out.println(Integer.toBinaryString(num1));
        System.out.println(Integer.toHexString(num1));
        System.out.println(Integer.toOctalString(num1));

        str1 = "100";
        str2 = "1";  //binary string
        System.out.println(Integer.parseInt(str1));
        System.out.println("CONVERT BINARY TO DECIMAL INT ="+Integer.parseInt(str1,2));








    }



}
