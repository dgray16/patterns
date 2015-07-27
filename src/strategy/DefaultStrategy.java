package strategy;

/**
 * Created by Administrator on 13.05.2015.
 */
public class DefaultStrategy implements EmployerStrategy {
    @Override
    public String getTechnology() {
        return "Default";
    }
}
