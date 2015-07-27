package iterator;

/**
 * Created by Administrator on 20.04.2015.
 */
public class DevelopersFirm {
    private ProgrammersGroup[] programmersGroups = new ProgrammersGroup[0];

    public void addGroup(ProgrammersGroup group) {
        ProgrammersGroup[] temp = programmersGroups;
        programmersGroups = new ProgrammersGroup[programmersGroups.length + 1];
        for (int i = 0; i < temp.length; i++) {
            programmersGroups[i] = temp[i];
        }
        programmersGroups[temp.length] = group;
    }
    public int size(){
        return programmersGroups.length;
    }
    public ProgrammersGroup getGroup(int index){
        return programmersGroups[index];
    }
}
