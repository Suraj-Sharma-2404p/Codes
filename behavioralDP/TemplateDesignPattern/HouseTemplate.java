package behavioralDP.TemplateDesignPattern;

public abstract class HouseTemplate {
    //template method so subclass can not override
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built!!");
    }

    //default implementation
    private void buildWindows(){
        System.out.println("Building same Windows!!");
    }

    //methods to be implemented by subclasses
    public abstract void buildWalls();
    public abstract void buildPillars();

    public void buildFoundation(){
        System.out.println("Building same foundation for all type of building!!");
    }
}
