package prototype;

/**
 * Created by Administrator on 26.02.2015.
 */
public interface PrototypeCapable extends Cloneable {
    // Method clone that returns PrototypeCapable value
    public PrototypeCapable clone() throws CloneNotSupportedException;
}
