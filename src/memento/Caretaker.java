package memento;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Administrator on 12.06.2015.
 */
public class Caretaker {
    private final ProgrammerOriginator originator = new ProgrammerOriginator();
    private final Stack<Memento> saves = new Stack<Memento>();

    public void startAction(){
        System.out.println("Type new state:");
        Scanner input = new Scanner(System.in);
        String pushState = input.nextLine();
        originator.action(pushState);
    }

    public void save(){
        saves.push(originator.save());
    }
    public void load(){
        originator.load(saves.peek());
    }
}
