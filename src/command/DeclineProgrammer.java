package command;

/**
 * Created by Administrator on 12.06.2015.
 */
public class DeclineProgrammer implements Hiring {
    private Programmer programmer;

    public DeclineProgrammer(Programmer programmer){
        this.programmer = programmer;
    }

    @Override
    public void check() {
        programmer.decline();
    }
}
