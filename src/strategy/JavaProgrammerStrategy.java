package strategy;

/**
 * Created by Administrator on 13.05.2015.
 */
public class JavaProgrammerStrategy implements EmployerStrategy {
    @Override
    public String getTechnology() {
        return "Java";
    }
}
