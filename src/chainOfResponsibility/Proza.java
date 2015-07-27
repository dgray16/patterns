package chainOfResponsibility;

/**
 * Created by Administrator on 13.05.2015.
 */
public class Proza extends Employer {

    public Proza(Employer employer) {
        super(employer);
    }

    @Override
    public void HandleWorker(Worker worker){
        if (worker.type.equals("C++")){
            System.out.println("Proza is catching new C++ developer!");
        }
        super.HandleWorker(worker);
    }
}
