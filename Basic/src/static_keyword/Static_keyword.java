package static_keyword;

public class Static_keyword {
    static String name =" kavi";
    byte age= 9;
    String grade = "1st";

    public void displayDetails(){
        System.out.println("Student "+name+"is "+age+"years old and in"+grade);
    }

    public static void doThis(){
        System.out.println("do");
    }


}
// use ststic when you want to share it with multiple objects
// access static variable using class name