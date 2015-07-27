package chainOfResponsibility;

/**
 * Created by Administrator on 13.05.2015.
 */
public abstract class Employer {
    public Employer employer;

    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    protected Employer(Employer employer){
        this.employer = employer;
    }

    public void HandleWorker(Worker worker){
        if (employer != null){
            employer.HandleWorker(worker);
        }
    }
}
