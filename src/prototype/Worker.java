package prototype;

/**
 * Created by Administrator on 26.02.2015.
 */
public class Worker implements PrototypeCapable {

    // Overrided method that was implemented by PrototypeCapable interface
    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        System.out.println("Cloning worker[prototype] object...");

        // Returns PrototypeCapable value that casting to Worker with fathers clone method
        return (Worker) super.clone();
    }

    // Overrided method toString
    @Override
    public String toString() {
        return "Worker[prototype]";
    }

}