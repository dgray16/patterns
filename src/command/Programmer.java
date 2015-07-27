package command;

/**
 * Created by Administrator on 12.06.2015.
 */
public class Programmer {
    private String name;

    public Programmer(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void accept(){
        System.out.println("Programmer: " + name + " - accepted");
    }
    public void decline(){
        System.out.println("Programmer: " + name + " - declined");
    }
}
