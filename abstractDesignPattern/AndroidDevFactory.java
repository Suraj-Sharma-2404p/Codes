package abstractDesignPattern;

public class AndroidDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployeeObject() {
        return new AndroidDeveloper();
    }
}
