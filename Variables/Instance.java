package Variables;

public class Instance {
    // this instance variable is visible for any child class.
    public String name;
    // salary  variable is visible in Employee class only.
    private double salary;

    public Instance(String empName) {
        name = empName;
    }

    // The salary variable is assigned a value.
    public void setSalary(double empSal) {
        salary = empSal;
    }

    // This method prints the employee details.
    public void printEmp() {
        System.out.println("name  : " + name );
        System.out.println("salary :" + salary);
    }
}
