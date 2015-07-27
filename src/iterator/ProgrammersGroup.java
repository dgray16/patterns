package iterator;

/**
 * Created by Administrator on 20.04.2015.
 */
public class ProgrammersGroup {
    private Programmer[] programmers = new  Programmer[0];

    public void addProgrammer(Programmer programmer){
        Programmer[] temp = programmers;
        programmers = new Programmer[programmers.length + 1];
        for (int i = 0; i < temp.length; i++){
            programmers[i] = temp[i];
        }
        programmers[temp.length] = programmer;
    }
    public int size(){
        return programmers.length;
    }
    public Programmer getProgrammer(int index){
        return programmers[index];
    }
}
