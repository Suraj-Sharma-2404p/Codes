package behavioralDP.TemplateDP.Templates;

import behavioralDP.TemplateDP.TempImpl.GlassHouse;
import behavioralDP.TemplateDP.TempImpl.WoodenHouse;

public class HousingClient {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();
        System.out.println("*********************");
        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
