package adapter;

/**
 * Created by Administrator on 30.03.2015.
 */
public class WebMasterAdapter implements Programmer {
    private WebMaster webMaster;

    public WebMasterAdapter(WebMaster webMaster){
        this.webMaster = webMaster;
     }

    @Override
    public void getProgrammer() {
        webMaster.getStatus();
    }
}
