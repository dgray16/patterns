package bridge;

/**
 * Created by Administrator on 30.03.2015.
 */
public class ApplicationProject extends Project {
    @Override
    public void getStatus() {
        String string = programmer.getStatus();
        System.out.println("This is application project and it leads " + string + " programmer");
    }
}
