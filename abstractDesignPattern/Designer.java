package abstractDesignPattern;

public class Designer implements Employee{
    @Override
    public int salary() {
        return 80000;
    }

    @Override
    public String name() {
        System.out.println(" I am a designer!!");
        return "I am a Designer!!";
    }
}
