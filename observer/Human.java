package observer;

import java.util.ArrayList;

public class Human implements Subject{
    private ArrayList<Observer> observers;

    public Human(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0)
            observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers)
            observer.update();
    }


}
