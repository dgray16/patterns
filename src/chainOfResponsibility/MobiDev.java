package chainOfResponsibility;

/**
 * Created by Administrator on 13.05.2015.
 */
public class MobiDev extends Employer {

    public MobiDev(Employer employer) {
        super(employer);
    }

    @Override
    public void HandleWorker(Worker worker){
        if (worker.type.equals("iOS")){
            System.out.println("MobiDev is catching new iOS developer!");
        }
        super.HandleWorker(worker);
    }
}
