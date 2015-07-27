package prototype;

/**
 * Created by Administrator on 26.02.2015.
 */
public class PrototypeFactory {
    public static class ModelType{
        public static final String WORKER = "worker[prototype]";
    }
    // Set PrototypeCapable interface to Map/HashMap and make value static
    private static java.util.Map<String, PrototypeCapable> prototypes = new java.util.HashMap<String, PrototypeCapable>();

    // Put concrete values to Map/HashMap
    static {
        prototypes.put(ModelType.WORKER, new Worker());
    }

    // get first instance of object and clone it - not creating new
    public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException{
        return ((PrototypeCapable) prototypes.get(s).clone());
    }
}
