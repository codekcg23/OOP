package static_keyword;

import static_keyword.Static_keyword;

public class Static_Main {

    public static void main(String args[]){
        Static_keyword sk1 = new Static_keyword();
        Static_keyword sk2 = new Static_keyword();

        sk1.grade = "2nd";
        sk1.age =12;
      //  sk1.name = "lal";
        Static_keyword.name ="lal";
        // no longer belong to object static variable belong to class
        // share among all objects

        sk2.grade = "3nd";
        sk2.age =13;
     //   sk2.name = "lila";       override
        Static_keyword.name = "lila";

        sk1.displayDetails();
        Static_keyword.doThis();
        sk2.displayDetails();

    }
}


