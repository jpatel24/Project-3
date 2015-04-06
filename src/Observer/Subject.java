package Observer;

/**
 * Created by Ethan and Jeel on 4/5/2015.
 */
public interface Subject {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

}
