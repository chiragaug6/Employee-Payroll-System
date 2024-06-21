public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        FullTimeEmployee emp1 = new FullTimeEmployee("chirag", 1, 600000.00);
        PartTimeEmployee emp2 = new PartTimeEmployee("heet", 2, 50, 100);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("starting List");
        payrollSystem.displayEmployees();

        payrollSystem.removeEmployee(2);

        System.out.println("end List");
        payrollSystem.displayEmployees();
    }
}
