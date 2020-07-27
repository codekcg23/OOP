package super_keyword;

public class B extends A{
    int num1=100;
    public  void doThis(){
        System.out.println("Do this from B");
    }

    public  void xyz(){
        System.out.println(super.num1);
        doThis();
        super.doThis();  // do this from super class parent class
        System.out.println("xyz");
    }

}
