package abstractFactory;

/**
 * Created by Administrator on 18.03.2015.
 */
public class WebFactory implements HumanResources {

    @Override
    public Programmer getProgrammer() {
        return new WebProgrammer("Dante - web programmer");
    }

    @Override
    public Tester getTester() {
        return new WebTester("Huang - web tester");
    }
}
