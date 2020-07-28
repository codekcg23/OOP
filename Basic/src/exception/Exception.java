package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception {
    public static  void main(String [] args) throws IOException {
        // unchecked   RunTime Exception : checked at run time
                    // ex-: ArithmaticException,ArrayIndexOutOfBound
        // checked   checked at compile time we need to handle these
              // IOException , ClassNotFountException
    abc();

    }
    public static void abc() throws FileNotFoundException {
        FileInputStream x = new FileInputStream("");
    }
}
// throws =   warn user
// try - catch

/*
  try{
  FileInputStream x = new FileInputStream("");
  }catch(FileNotFoundException e){
  e.getMessage()
  e.toString()
  e.printStackTrace()
  }finally{
      always execute
  }

 */

// provides steps to recover program continue