public class Employee {

    String employeeName = "";
    int employeeId = 100;
    int employeeSalary =1000;

    public void displayEmployee(){
        System.out.println("Employee Name = "+employeeName+"\n Id = "+employeeId+"\n Salary = "+employeeSalary+"\n bonus ="+ (employeeSalary*0.02));
    }

}
