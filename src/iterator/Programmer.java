package iterator;

/**
 * Created by Administrator on 20.04.2015.
 */
public class Programmer {
    protected String name;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name: " + name;
    }
}
