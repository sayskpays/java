package cs.design_pattern;

import java.util.ArrayList;
import java.util.List;

interface Subject{
    public void register(Observer obj);
    public void unregister(Observer obj);
    public void notifyObservers();
    public Object getUpdate(Observer obj);
}

interface Observer{
    public void update();
}

class Topic implements Subject{

    private List<Observer> observers;
    private String message;

    public Topic(){
        this.observers = new ArrayList<>();
        this.message = "";
    }

    @Override
    public void register(Observer obj) {
        if(!observers.contains(obj)){
            observers.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observers-> observers.update());
        this.observers.forEach(Observer::update);

    }

    @Override
    public Object getUpdate(Observer obj) {
        return null;
    }
}

public class ObserverPattern {

}
