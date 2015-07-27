package decorator;

/**
 * Created by Administrator on 29.03.2015.
 */
public class Programmer {
    private String name = "Vova";
    protected String typeOfProgrammer;

    public void getStatus(){
        System.out.println("Hello, my name is: " + name + ". I`m - " + typeOfProgrammer + " programmer");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfProgrammer() {
        return typeOfProgrammer;
    }
    public void setTypeOfProgrammer(String typeOfProgrammer) {
        this.typeOfProgrammer = typeOfProgrammer;
    }
}
