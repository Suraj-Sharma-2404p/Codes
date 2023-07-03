package behavioralDP.TemplateDP.Templates;

public abstract class HouseTemplate {
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built!!");
    }

    //default implementation
    private void buildWindows(){
        System.out.println("building default house windows!!");
    }

    //methods to be implemented by subclasses
    public abstract void buildWalls();
    public abstract void buildPillars();

    public void buildFoundation(){
        System.out.println("Building foundation which is gonna be same for all types of houses!!");
    }
}
