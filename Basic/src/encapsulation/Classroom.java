package encapsulation;

public class Classroom {
    private String subject;

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    private int studentCount;
    // stop accessing class variables to out

    // allow other classes to access values indirectly

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public  void  displayDetails(){
        System.out.println("subject = "+subject+"cont = "+ studentCount);
    }

}
// getters and setters looks like small encapsule