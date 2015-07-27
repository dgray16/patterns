package templateMethod;

/**
 * Created by Administrator on 12.06.2015.
 */
public class WebDeveloperSalary extends CountSalary {
    @Override
    protected int setTime(int days) {
        return days;
    }

    @Override
    protected int setRate(int ratePerDay) {
        return ratePerDay;
    }
}
