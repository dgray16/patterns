package memento;

/**
 * Created by Administrator on 12.06.2015.
 */
public class ProgrammerOriginator {
    private String state = "default";

    public void action(String incomeState){
        System.out.println("Before state: " + state);
        state = incomeState;
    }

    public Memento save(){
        return new Memento(state);
    }

    public void load(Memento memento){
        state = memento.getState();
    }
}
