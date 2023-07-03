package factoryDesign;

public class DeveloperClient {
    public static void main(String[] args) {
    Employee employee = EmployeeFactory.getEmployee("Android Developer");
    int salary = employee.getSalary();
        System.out.println(salary);
        Employee employee2 = EmployeeFactory.getEmployee("Web Developer");
        int salary2 = employee2.getSalary();
        System.out.println(salary2);
    }

}
