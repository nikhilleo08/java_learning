package Variables;

public class Main {
    public static void main(String args[]) {
        // Local Variable
        Local test = new Local();
        test.pupAge();

        // Instance Variable
        Instance ins = new Instance("Nikhil");
        ins.printEmp();

        // Static Variable
        Static st = new Static();
        System.out.println("Static Variable Department: " + Static.DEPARTMENT);
        System.out.println("Static Variable Pi: " + Static.pi);
    }
}
