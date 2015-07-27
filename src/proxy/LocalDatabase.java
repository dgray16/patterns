package proxy;

/**
 * Created by Administrator on 29.03.2015.
 */
public class LocalDatabase implements Workers {
    private GlobalDatabase globalDatabase;

    public LocalDatabase(GlobalDatabase globalDatabase){
        this.globalDatabase = globalDatabase;
    }

    @Override
    public int getWorkers(String storage) {
        if (storage.equals("local")){
            return 50;
        }else {
            return globalDatabase.getWorkers(storage);
        }
    }
}
