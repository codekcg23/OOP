public class Road_Toll_Main {
    public static void main(String args[]){

        Road_Toll t1 = new Road_Toll();
        //Road_Toll is a constructor
        // when no constructor default one use but if there is
        // a explicit constructor, you have to use it


      //  t1.type = "swdd";
       // t1.tiresNum =2;
        t1.calculateTotal();

        Road_Toll t2 = new Road_Toll("car",9);
        //Road_Toll is a constructor
        // don't need to initialize separately

     //   t2.type = car;
       // t2.tiresNum =6;
        t2.calculateTotal();
    }


}
