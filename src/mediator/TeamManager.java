package mediator;

import java.util.Scanner;

/**
 * Created by Administrator on 20.04.2015.
 */
public class TeamManager extends TeamAdministration {
    private String problem;

    public TeamManager(MainBrain teamBrain) {
        super(teamBrain);
    }

    public void receiveOrder(){
        System.out.println("Connecting to administration...");
        Scanner input = new Scanner(System.in);
        problem = input.nextLine();
        System.out.println("Problem received");
        someChanges();
    }

    public String getProblem(){
        return problem;
    }
    public void setProblem(String problem) {
        this.problem = problem;
    }
}
