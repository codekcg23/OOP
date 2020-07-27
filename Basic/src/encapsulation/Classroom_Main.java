package encapsulation;

import encapsulation.Classroom;

public class Classroom_Main {
    public static void main(String args[]){

        Classroom c1 = new Classroom();
      //  c1.subject="Maths";
        c1.setSubject("Math");
      //  c1.studentCount = 12;
        c1.setStudentCount(12);
        c1.displayDetails();

    }
}

// teemplate a blueprint use to create a object
//doesn't affect variable change in main class to other class
// because using setter and getter