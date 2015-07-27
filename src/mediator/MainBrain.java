package mediator;

/**
 * Created by Administrator on 20.04.2015.
 */
public class MainBrain {
    private String name;
    private TeamManager teamManager = new TeamManager(this);

    public MainBrain(){
        this.teamManager = new TeamManager(this);
        this.name = "Tempo1";
    }

    public void resolvingProblems(TeamAdministration somePerson){
        if (somePerson instanceof TeamManager) teamManagerOperation();
    }

    private void teamManagerOperation(){
        System.out.println("Your problem - solved!");
    }
    public void getStatus(){
        System.out.println("Name: " + name);
    }
    public void pushProblem(){
        getStatus();
        teamManager.receiveOrder();
    }
}
