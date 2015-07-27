package factoryMethod;

/**
 * Created by Administrator on 26.02.2015.
 */
public class WorkerFactory {
    public Worker getWorker(String workerType){
        if (workerType == null) return null;
        // Returns new Programmer if you type in main program Worker worker1 = workerFactory.getWorker("Programmer");
        if (workerType.equalsIgnoreCase("Programmer")) return new Programmer();
        return null;
    }
}
