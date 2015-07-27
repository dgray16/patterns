package state;

/**
 * Created by Administrator on 12.06.2015.
 */
public class ProgrammerDenied implements State {
    @Override
    public void action() {
        System.out.println("Denied!");
    }
}
