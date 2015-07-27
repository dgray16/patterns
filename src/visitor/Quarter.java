package visitor;

/**
 * Created by Administrator on 13.05.2015.
 */
public class Quarter implements Place {

    private boolean web;

    public Quarter(boolean web){
        this.web = web;

    }

    public int quarterNumber;
    public int getQuarterNumber() {
        return quarterNumber;
    }
    public void setQuarterNumber(int quarterNumber) {
        this.quarterNumber = quarterNumber;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.check(this);
    }

    public boolean hasWebDeveloper(){
        if (web == true) return true;
        else return false;
    }
}
