package visitor;

/**
 * Created by Administrator on 13.05.2015.
 */
public class WebDeveloperValidator implements Visitor {
    @Override
    public void check(Room room) {
        if (room.hasWebDeveloper() == true) System.out.println("Web developer in room");
        else System.out.println("No web developer in room");
    }

    @Override
    public void check(Office office) {
        if (office.hasWebDeveloper() == true) System.out.println("Web developer in office");
        else System.out.println("No web developer in office");
    }

    @Override
    public void check(Quarter quarter) {
        if (quarter.hasWebDeveloper() == true) System.out.println("Web developer in quarter");
        else System.out.println("No web developer in quarter");
    }
}
