package command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 12.06.2015.
 */
public class Invoker {
    private List<Hiring> hiringsList = new ArrayList<Hiring>();

    public void takeHiring(Hiring hiring){
        hiringsList.add(hiring);
    }

    public void placeHiring(){
        for (Hiring hiring : hiringsList){
            hiring.check();
        }
        hiringsList.clear();
    }
}
