package visitor;

/**
 * Created by Administrator on 13.05.2015.
 */
public class Office implements Place {
    private boolean web;

    public Office(boolean web){
        this.web = web;
    }

    public int officeNumber;
    public int getOfficeNumber() {
        return officeNumber;
    }
    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
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
