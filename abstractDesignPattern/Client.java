package abstractDesignPattern;

public class Client {
    public static void main(String[] args) {
        // if we want android developer
        Employee androidEmployee = EmployeeFactory.getEmployee(new AndroidDevFactory());
        androidEmployee.name();

        Employee webdevEmployee = EmployeeFactory.getEmployee(new WebDevFActory());
        webdevEmployee.name();

        Employee designer = EmployeeFactory.getEmployee(new DesignerFactory());
        designer.name();
    }
}
