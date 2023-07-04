package behavioralDP.TemplateDesignPattern;

public class Implementation {
    public static void main(String[] args) {
        HouseTemplate woodenHouse = new WoodenHousse();
        woodenHouse.buildHouse();

        HouseTemplate glassHouse = new GlassHouse();
        glassHouse.buildHouse();
    }
}
