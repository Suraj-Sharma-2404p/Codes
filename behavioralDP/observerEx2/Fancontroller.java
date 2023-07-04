package behavioralDP.observerEx2;

public class Fancontroller implements Observer2{
    @Override
    public void update(float temperature) {
        if (temperature > 30) {
            System.out.println("Fan: ON");
        } else {
            System.out.println("Fan: OFF");
        }
    }
}
