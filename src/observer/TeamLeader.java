package observer;

/**
 * Created by Administrator on 20.04.2015.
 */
public class TeamLeader extends Observer {
    @Override
    public void update(Observable observable, String msg) {
        System.out.println("Hello " + msg + ", i`m watching you - your Team Leader");
    }
}
