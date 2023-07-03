package abstractDesignPattern;

public class DesignerFactory extends  EmployeeAbstractFactory{
    @Override
    public Employee createEmployeeObject() {
        return new Designer();
    }
}
