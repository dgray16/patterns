package chainOfResponsibility;

import java.util.List;

/**
 * Created by Administrator on 13.05.2015.
 */
public class SoftServe extends Employer {

    public SoftServe(Employer employer) {
        super(employer);
    }

    @Override
    public void HandleWorker(Worker worker){
        if (worker.type.equals("Java")){
            System.out.println("SoftServe is catching new Java developer!");
        }
        super.HandleWorker(worker);
    }
}
