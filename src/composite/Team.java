package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 29.03.2015.
 */
public class Team implements DevelopersTeam {
    private List<DevelopersTeam> developersContainer = new ArrayList<>();

    @Override
    public void addProgrammer(DevelopersTeam developersTeam) {
        developersContainer.add(developersTeam);
    }

    @Override
    public int countProgrammers() {
        int value = 0;
        for (DevelopersTeam developersTeam : developersContainer){
            value += developersTeam.countProgrammers();
        }
        return value;
    }
}
