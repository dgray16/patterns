package decorator;

/**
 * Created by Administrator on 29.03.2015.
 */
public abstract class ProgrammerDecorator extends Programmer {
    protected Programmer decoratedProgrammer;

    public ProgrammerDecorator(Programmer programmer){
        this.decoratedProgrammer = programmer;
    }

    @Override
    public void getStatus(){
        decoratedProgrammer.getStatus();
    }

    public Programmer getDecoratedProgrammer() {
        return decoratedProgrammer;
    }
    public void setDecoratedProgrammer(Programmer decoratedProgrammer) {
        this.decoratedProgrammer = decoratedProgrammer;
    }
}
