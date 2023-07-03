package behavioralDP.ObserverDP;

public interface Subject {
    //methods to register and deregister observers
    public void register(Observer ob);
    public void unregister(Observer ob);

    //methods to notify observers of change
    public void notifyObservers();

    //methods to get updates from a subject
    public Object getUpdate(Observer ob);
}
