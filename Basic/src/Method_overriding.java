public class Method_overriding {

    public  static  void  main(String[] args){
        Dog d = new Dog();
        d.display();

        Cat c = new Cat();
        c.display();

        //============= Polymorphism ==========
        // Ability to get in multiple forms

        Animal a ;        // form of animal
        a = new Dog();    // intiate with constructor of dog
        // same a becomes a dog
        a.display();

        a = new Cat();    // same object a act as a cat
        a.display();

        // super class and sub class has a method that has same name and same arguments
        // sub class method overrides the parent class method
    }
}
