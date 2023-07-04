package behavioralDP.observerEx2;

public class TemperatureDisplay implements Observer2{
    @Override
    public void update(float temperature) {
        System.out.println("Temperature Display: " + temperature + " degrees Celsius");

    }
}
