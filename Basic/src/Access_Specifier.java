public class Access_Specifier {

    public int c = 100;
    private int a = 10;

    public void doThisPublic(){
        System.out.println("Public Methods");
        //everywhere in same project

    }
    private void doThisPrivate(){
        System.out.println("Private Methods");
        // can access only in this class

    }
    void doThisDefault(){
        System.out.println("Default methods");
        // limited all the classes in  package or module
        // outside of package not allowed
    }
}
