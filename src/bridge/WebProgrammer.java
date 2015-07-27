package bridge;

/**
 * Created by Administrator on 30.03.2015.
 */
public class WebProgrammer implements Programmer {
    private String type = "Web";

    @Override
    public String getStatus() {
        return type;
    }
}
