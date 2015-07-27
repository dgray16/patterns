package templateMethod;

/**
 * Created by Administrator on 12.06.2015.
 */
public abstract class CountSalary {
    public final void countSalary(int days, int ratePerDay){
        System.out.println("Salary = " + setTime(days) * setRate(ratePerDay));
    }
    protected abstract int setTime(int days);
    protected abstract int setRate(int ratePerDay);
}
