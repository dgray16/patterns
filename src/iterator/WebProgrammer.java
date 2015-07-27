package iterator;

/**
 * Created by Administrator on 20.04.2015.
 */
public class WebProgrammer extends Programmer {
    protected String type;

    public String getType(){
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return super.toString() + " - Type: " + type;
    }
}
