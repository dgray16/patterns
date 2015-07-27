package interpreter;

/**
 * Created by Administrator on 12.06.2015.
 */
public class TerminalExpression implements Expression {
    String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) return true;
        return false;
    }
}
