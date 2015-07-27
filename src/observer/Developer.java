package observer;

/**
 * Created by Administrator on 20.04.2015.
 */
public class Developer extends Observable {
    public void getName(){
        notifyObservers("Vova");
    }
}
