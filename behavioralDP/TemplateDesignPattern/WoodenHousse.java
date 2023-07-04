package behavioralDP.TemplateDesignPattern;

public class WoodenHousse extends HouseTemplate{
    @Override
    public void buildWalls() {
        System.out.println("building wooden walls!!");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building wooden pillars!!");
    }
}
