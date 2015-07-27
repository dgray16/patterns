package memento;

/**
 * Created by Administrator on 12.06.2015.
 */
public class Memento {
    private String state = null;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
