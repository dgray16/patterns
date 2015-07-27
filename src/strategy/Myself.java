package strategy;

/**
 * Created by Administrator on 13.05.2015.
 */
public class Myself {
    private EmployerStrategy strategy = new DefaultStrategy();

    public void changeStrategy(EmployerStrategy strategy){
        this.strategy = strategy;
    }

    public void getEmployer(){
        String technology = strategy.getTechnology();
        System.out.println("My technology: " + technology);
    }
}
