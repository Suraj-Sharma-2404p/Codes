package behavioralDP.observerEx2;

public interface Subject2 {
    void addObserver(Observer2 observer);
    void removeObserver(Observer2 observer);
    void notifyObserver();
}
