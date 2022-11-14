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
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message sended to Topic:" + msg);
        this.message = msg;
        notifyObservers();
    }
}

class TopicSubscriber implements Observer{
    private String name;
    private Subject topic;

    public TopicSubscriber(String name, Subject topic) {
        this.name = name;
        this.topic = topic;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        System.out.println(name + ":: got message >> " + msg);

    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        Topic topic = new Topic();

        Observer aObserver = new TopicSubscriber("a", topic);
        Observer bObserver = new TopicSubscriber("b", topic);
        Observer cObserver = new TopicSubscriber("c", topic);

        topic.register(aObserver);
        topic.register(bObserver);
        topic.register(cObserver);

        topic.postMessage("amumu");
    }
}
