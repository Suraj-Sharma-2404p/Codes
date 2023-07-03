package behavioralDP.ObserverDP;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class MyTopic implements  Subject{

    public List<Observer> observers = new ArrayList<>();
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    @Override
    public void register(Observer ob) {
        if (ob == null){
            throw  new NullPointerException("Null observer");
        }else{
            synchronized (MUTEX){
                if (!observers.contains(ob)){
                    observers.add(ob);
                }
            }
        }
    }

    @Override
    public void unregister(Observer ob) {
        synchronized (MUTEX){
            observers.remove(ob);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observerLocal = null;
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX){
            if(!changed){
                return;
            }else {
                observerLocal = new ArrayList<>(this.observers);
                this.changed = false;
            }
            for (Observer observer:
                 observerLocal) {
                observer.update();
            }
        }
    }

    @Override
    public Object getUpdate(Observer ob) {
        return this.message;
    }

    //method to post message to the topic
    public void postMessage(String msg){
        System.out.println("message posted to the Topic:" + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }

}
