package factoryDesign;

public class AndroidDeveloper implements Employee {

    @Override
    public int getSalary() {
        System.out.println("salary of ANDROID dev : 8000 USD");
        return 8000;
    }
}
