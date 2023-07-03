package abstractDesignPattern;

public class WebDevFActory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployeeObject() {
        return new WebDeveloper();
    }
}
