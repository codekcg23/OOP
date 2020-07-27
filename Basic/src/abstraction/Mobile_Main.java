package abstraction;

public class Mobile_Main {
    public static void main(String[] args){
        Mobile m1;
        m1 = new Ios();
        m1.doubleTap();

        m1 = new Android();
        m1.doubleTap();


    }
}
