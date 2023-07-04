package behavioralDP.observerEx2;

public class Implementation2 {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        TemperatureDisplay tempDisplay = new TemperatureDisplay();
        Fancontroller fanController = new Fancontroller();

        weatherStation.addObserver(tempDisplay);
        weatherStation.addObserver(fanController);

        weatherStation.setTemperature(25.5f);
        // Output:
        // Temperature Display: 25.5 degrees Celsius
        // Fan: OFF

        weatherStation.setTemperature(32.0f);
        // Output:
        // Temperature Display: 32.0 degrees Celsius
        // Fan: ON

        weatherStation.removeObserver(fanController);
        weatherStation.setTemperature(28.0f);
        // Output:
        // Temperature Display: 28.0 degrees Celsius

    }
}
