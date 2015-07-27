package decorator;

/**
 * Created by Administrator on 29.03.2015.
 */
public class ApplicationProgrammer extends ProgrammerDecorator {
    public ApplicationProgrammer(Programmer programmer) {
        super(programmer);
    }

    @Override
    public void getStatus(){
        super.getStatus();
        System.out.println("BUT");
        System.out.println("+ i`m application programmer too");
    }
}
