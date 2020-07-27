package final_keyword;

public  class Final_keyword {
    final int A = 100;  //become the constant

    final void abc(){     //avoid overriding
        System.out.println("final method");
    }
}
// if add final to class nobody can inherit it
// if add final to method method cannot be override
// if add final to field cannot change that field