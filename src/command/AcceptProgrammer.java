package command;

/**
 * Created by Administrator on 12.06.2015.
 */
public class AcceptProgrammer implements Hiring {
    private Programmer programmer;

    public AcceptProgrammer(Programmer programmer){
        this.programmer = programmer;
    }

    @Override
    public void check() {
        programmer.accept();
    }
}
