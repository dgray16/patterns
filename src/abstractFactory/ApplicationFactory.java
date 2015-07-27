package abstractFactory;

/**
 * Created by Administrator on 18.03.2015.
 */
public class ApplicationFactory implements HumanResources {
    @Override
    public Programmer getProgrammer() {
        return new ApplicationProgrammer("Danylo - application programmer");
    }

    @Override
    public Tester getTester() {
        return new ApplicationTester("Arsenij - application tester");
    }
}
