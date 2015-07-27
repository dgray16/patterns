package visitor;

/**
 * Created by Administrator on 13.05.2015.
 */
public interface Visitor {
    void check(Room room);
   void check(Office office);
    void check(Quarter quarter);
}
