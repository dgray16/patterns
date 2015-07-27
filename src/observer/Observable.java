package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 20.04.2015.
 */
public abstract class Observable {
    private List<Observer> observersList = new ArrayList<>();

    public void addObs(Observer observer){
        observersList.add(observer);
    }
    public void notifyObservers(String msg){
        for (Observer observer : observersList){
            observer.update(this, msg);
        }
    }
}
