package behavioralDP.observerEx2;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements  Subject2{
    private List<Observer2> observers;
    private float temperature;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer2 observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer2 observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer2 observer : observers) {
            observer.update(temperature);
        }
    }
}
