package Variables;

public class Static {
    public static double pi = 3.14;

    // salary  variable is a private static variable
    private static double salary;

    // DEPARTMENT is a constant
    protected static final String DEPARTMENT = "Development ";

    public Static() {
        salary = 1000;
        System.out.println(DEPARTMENT + "Department's Average Salary is: " + salary);
    }
}
