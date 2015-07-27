package bridge;

/**
 * Created by Administrator on 30.03.2015.
 */
public abstract class Project {
    protected Programmer programmer;

    public Project(){
        this.programmer = null;
    }

    public void setProjectProgrammer(Programmer programmer){
        this.programmer = programmer;
    }

    abstract public void getStatus();
}
