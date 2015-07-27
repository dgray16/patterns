package mediator;

/**
 * Created by Administrator on 20.04.2015.
 */
public class TeamAdministration {
    private MainBrain brain;

    public TeamAdministration(MainBrain teamBrain){
        this.brain = teamBrain;
    }

    public void someChanges(){
        brain.resolvingProblems(this);
    }
}
