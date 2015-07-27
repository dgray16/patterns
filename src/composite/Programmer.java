package composite;

/**
 * Created by Administrator on 29.03.2015.
 */
public class Programmer implements DevelopersTeam {
    private int person = 1;

    public Programmer(){}

    @Override
    public void addProgrammer(DevelopersTeam developersTeam) {}

    @Override
    public int countProgrammers() {
        return person;
    }

    public int getPerson() {
        return person;
    }
    public void setPerson(int person) {
        this.person = person;
    }
}
