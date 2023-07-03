package abstractDesignPattern;

public class EmployeeFactory {
    //create employee object

    public static Employee getEmployee(EmployeeAbstractFactory employeeAbstractFactory){
        Employee employeeObject = employeeAbstractFactory.createEmployeeObject();
        return employeeObject;
    }
}
