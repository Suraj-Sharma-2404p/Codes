package factoryDesign;

public class WebDeveloper implements Employee {

    @Override
    public int getSalary() {
        System.out.println("getting salary of employee(Web Developer) : 5000 USD");
        return 5000;
    }
}
