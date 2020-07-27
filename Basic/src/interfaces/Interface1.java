package interfaces;
// default consider as public
//default all method are abstract exception static and default
// abstract class have both abstract and normal methods
// cannot have data members
public interface Interface1 {
    // int a;  X
    // can only have static and final
    void doThis();
    static void xyz(){
        System.out.println("static xyz in interface1");
    }

    default void nmo(){
        System.out.println("default nmp in interface1");
    }
    // sub class can override default method
}
// inherit an interface ==== implement an interfae

// does not have a constructor but abstract class has a constructor

// cannot initiate object

//class can implements interface
// but class cannot be parent to interface