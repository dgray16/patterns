package proxy;

/**
 * Created by Administrator on 29.03.2015.
 */
public class GlobalDatabase implements Workers {
    @Override
    public int getWorkers(String storage) {
        return 100;
    }
}
