package iterator;

/**
 * Created by Administrator on 20.04.2015.
 */
public class FirmIterator {
    private DevelopersFirm itdev;
    private int currentProgrammer = 0;
    private int currentGroup = 0;

    public FirmIterator(DevelopersFirm group){
        this.itdev = group;
    }
    public boolean hasNext(){
        if (currentGroup == itdev.size() || currentProgrammer == itdev.getGroup(currentGroup).size()) return false;
        return true;
    }
    public Programmer next(){
        ProgrammersGroup group = itdev.getGroup(currentGroup);
        Programmer programmer = group.getProgrammer(currentProgrammer);

        currentProgrammer++;

        if (currentProgrammer == group.size()){
            currentGroup++;
            currentProgrammer = 0;
        }
        return programmer;
    }
}
