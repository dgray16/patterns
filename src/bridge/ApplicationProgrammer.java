package bridge;

/**
 * Created by Administrator on 30.03.2015.
 */
public class ApplicationProgrammer implements Programmer {
    private String type = "Application";

    @Override
    public String getStatus() {
        return type;
    }
}
