package interpreter;

/**
 * Created by Administrator on 12.06.2015.
 */
public class AndExpression implements Expression {
    private Expression expression1 = null;
    private Expression expression2 = null;

    public AndExpression(Expression expr1, Expression expr2){
        this.expression1 = expr1;
        this.expression2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
