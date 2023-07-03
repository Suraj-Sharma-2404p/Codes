package behavioralDP.TemplateDP.TempImpl;

import behavioralDP.TemplateDP.Templates.HouseTemplate;

public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("building wooden walls!!");
    }

    @Override
    public void buildPillars() {
        System.out.println("building wooden pillars!!");
    }
}
