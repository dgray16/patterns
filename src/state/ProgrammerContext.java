package state;

/**
 * Created by Administrator on 12.06.2015.
 */
public class ProgrammerContext implements State {
    private State devState;

    public void setDevState(State devState) {
        this.devState = devState;
    }
    public State getDevState() {
        return devState;
    }

    @Override
    public void action() {
        this.devState.action();
    }
}
