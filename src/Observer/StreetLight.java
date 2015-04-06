package Observer;

import java.util.ArrayList;

/**
 * Created by Ethan and Jeel on 4/5/2015.
 */
public class StreetLight implements Subject {

    private ArrayList<Observer> observers;
    private String lightColor;

    public StreetLight(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(lightColor);
        }
    }

    public void setLightColor(String lightColor){
        this.lightColor = lightColor;
        notifyObservers();
    }
}
