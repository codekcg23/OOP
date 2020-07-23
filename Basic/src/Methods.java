public class Methods {
    public static void main(String[]args) {

        Methods m = new Methods();
        m.doThis();
        int result = m.addition(10,12);
        System.out.println(result);
    }
    public void doThis(){
        System.out.println("Do this");
    }
    public int addition(int num1 ,int num2){
        System.out.println(num1+num2);
        int sum = num1+num2;
        return sum;
    }
}
