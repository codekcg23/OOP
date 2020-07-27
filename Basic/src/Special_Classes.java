import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Special_Classes {

    // var not allow in class scope

    public static void  main(String [] args) {
        // Math class

        int num1 = 100;
        int num2 = 200;
        double num3 = 12.98;
        System.out.println(Math.min(num1,num2));
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.pow(num1,3));
        System.out.println(Math.ceil(num3));
        System.out.println(Math.floor(num3));
        System.out.println(Math.round(num3));
        System.out.println(Math.random()*100);


        // string builder
        // string in java is immutable create new object when concatinate
        //  StringBuilder class to  create mutable string

        String str1 = "hey";
        StringBuilder sb1 = new StringBuilder();
        sb1.append(" How ");
        sb1.append(" are you? ");
        System.out.println(sb1);

        sb1.insert(4," java");
        System.out.println(sb1);
        sb1.replace(4,6,"loll");
        // replace v=block wit sth
        System.out.println(sb1);

        sb1.delete(4,6);
        System.out.println(sb1);
        sb1.deleteCharAt(0);
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);


        //scanner class

        Scanner s1 = new Scanner(System.in);
        String str2 = s1.nextLine();
        //nextInt , nextDouble
        String temp = "";
        // reverse an string
        for(int i=0;i<str2.length();i++){
            temp = str2.charAt(i)+temp;
        }
        System.out.println(temp);

        //random class
        Random rnd1 = new Random();
        rnd1.nextInt(100);
        // less than 100 greater than 0
        // + 1000 to get range between

        // (int)(Math.random()*1000))


        // UUID
        System.out.println(UUID.randomUUID());

        // var keyword from java 10

        var arr2 = new int [10];
        // var arr3 = {10,20,20}      not allowed
        int [] arr3 = {10,20,30};
        var s2 = new Scanner(System.in);


        // Garbage collection in java
        /*
        String concatenation create new string objects every time
        previous object doesn't in use
        JVM might get out of memory
        automatic memeory manager garbase collector take care for that
        -----------Garabage collector interface-------
        To implement ew Garbage collector or remove existing one

        ============other updates===============
        object heap allocation
        new version in every 6 month
        root certificate for openJDK


         */
    }

}
