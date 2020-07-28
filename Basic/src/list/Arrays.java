package list;

import java.util.Scanner;

public class Arrays {
    public static  void main(String[] args){
        // collection of similar data types
        // size is fixed in arrays

        String [] days = {"Mon","wed","Fri","sun","sat"};
        System.out.println(days.length);
        System.out.println(days[0]);

        // update
        days[0]="Thu";

        // when you fix array you cannot add new elements
        // when you create array need to specify length

      //  System.out.println(days[7]); == ArrayIndexOutOfBoundsException

        for (int i = 0; i < days.length; i++){
            System.out.println(days[i]);
        }

        // ======Array object==========

        int [] arr1 = new int [10];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = i;
        }

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s1.nextInt();
        int [] arr = new int [10];

        for (int i = 1; i <= arr.length; i++) {
            arr[i-1] = num * i;
            System.out.println(arr[i-1]);
        }
//        for (int n : arr) {
//            System.out.println(n);
//
//        }

        //=======Exercese==============
        // Reverse an array
        System.out.println(" Reverse array");
        int [] arr2 = {10,20,30,40,50,60,70};

        int temp = 0;
        int j = arr2.length -1;  //last index

        for(int i =0; i< (arr2.length-1)/2; i++) {
            temp = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp;
            j--;

        }

        for (int x : arr2){
            System.out.println(x);
        }

        // ========= 2D array =============

        String [][] a = {{"a","b","c"},{"d","e"},{"f","g","h","i"}};
        System.out.println(a.length);
      //  System.out.println(a[0]);
        System.out.println(" 2D array");
        for(String [] x : a){
            for(String  y : x){
                System.out.println(y);
            }
        }


        // ====== Array of object
        // various type of data
        System.out.println("Array of objects");

        Object [] arr3 = {"Name",23,5.11,'c'};
        for ( Object x :arr3){
            System.out.println(x);
        }
        // 2D array of array of object
        Object [][] arry = {{"Name",23,5.11,'c'},{"lol",2,3.4,'e'}};
        for ( Object [] x :arry){
            for(Object y: x)
                System.out.print(y+" ");
            System.out.println();
        }





        // pascal triangle
        int n =4;
        System.out.println("==Pascal triangle===");
        for (int i = 0; i <= n; i++){
            for(int k=0; k <= n-i; k++) {
                System.out.print(" ");
            }
            for(int k =0; k <= i ; k++){
                System.out.print(" " + ncr(i,k));
            }
            System.out.println();
        }

        // Mathematical table 1 to 10




        // second largest number in array




        // largest number in array




    }

    public static int factorial(int n){
        int fact;
        for(fact = 1; n > 1; n--){
            fact = fact*n;
        }
        return fact;
    }

    public static int ncr (int n,int r){
        return factorial(n)/(factorial(n-r)*factorial(r));
    }
}
