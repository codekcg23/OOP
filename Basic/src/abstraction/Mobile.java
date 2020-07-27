package abstraction;

// == hiding implementation details from users ===
// no one can create object of class
// inheritance only

// provide functionality in first layer

public abstract class Mobile {

    public abstract void doubleTap();
    // no implementation
    public void abc(){

        // can implement non abstract method
        // don't force sub class to implement this
    }

}
