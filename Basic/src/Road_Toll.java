public class Road_Toll {
    String type;
    int tiresNum;

    public void calculateTotal(){
        if(tiresNum ==2){
            System.out.println("ypur toll amount is 0");
        }else if(tiresNum ==4){
            System.out.println("ypur toll amount is 10");
        }
        else if(tiresNum > 4){
            System.out.println("ypur toll amount is 20");
        }
        else{
            System.out.println("ypur toll amount is 3");
        }
    }
    // constructor is not a memeber off class
    // it execues automatically when create objects of class
    //use for initialize variables
    //default constructor
        /*
        public Road_Toll(){
        }
         */
    public Road_Toll(){
        System.out.println("Constructor");
    }

    public Road_Toll(String type,int tiresNum){
        this.type = type;
        this.tiresNum = tiresNum;

        // this  - current class (this class)
        // method argument assinged to class variable
    }

    // constructor overloading
    // differ data types, order or number of arguments
}
