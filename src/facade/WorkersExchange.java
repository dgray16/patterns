package facade;

/**
 * Created by Administrator on 30.03.2015.
 */
public class WorkersExchange {
    private Programmer programmer;
    private Tester tester;

    public WorkersExchange(){
        this.programmer = new Programmer();
        this.tester = new Tester();
    }

    public void programmer(){
        programmer.getProgrammer();
    }
    public void tester(){
        tester.getTester();
    }
}
