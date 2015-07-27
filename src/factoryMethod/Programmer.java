package factoryMethod;

/**
 * Created by Administrator on 26.02.2015.
 */
public class Programmer implements Worker {
    // Implemented method add from Worker interface
    @Override
    public void add() {
        System.out.println("Worker-programmer[factoryMethod]");
    }
}
