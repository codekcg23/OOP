public class OOP {
    public static void main(String[] args){
        Cars car1 = new Cars();
        // instantiate a new object
        // Cars is contructor of class
        // equal to name of class
        car1.color ="Red";
        car1.brand ="BMW";
        car1.displayDeatils();

        Cars car2 = new Cars();
        car2.color ="black";
        car2.brand = "alto";

        car2.displayDeatils();

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.employeeName ="ram";
        emp1.employeeId=198;
        emp1.employeeSalary= 1000;

        emp2.employeeName ="rani";
        emp2.employeeId=193;
        emp2.employeeSalary= 1090;

        Methods m = new Methods();
        m.doThis();
        int result = m.addition(10,12);

        Method_Overloading  M1 = new Method_Overloading();
        M1.addition(2.4,2.5,2);
        M1.addition(2.1,2.6);

        // Access Main

        Access_Specifier as = new Access_Specifier();
        as.doThisPublic();
        as.doThisDefault();
        // private method not allowed


        //    Inheritance  ----- is A relationship  class2 is a class 1
        Dog c2 = new Dog();
        c2.num1=8;
        c2.num2=9;
        c2.doSub();
        c2.doAddition();
        // rectangle always a polygon
        // triangle always a polygon
    }


}
