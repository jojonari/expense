package expensereport;

/**
 * Created by jojonari on 2017. 5. 16..
 */
public class BreakfastExpense extends Expense {
    public BreakfastExpense(int amount) {
        super(Type.BREAKFAST, amount);
    }

    @Override
    boolean isOverage() {
        return amount > 1000;
    }

    @Override
    String getName() {

        return "Breakfast";
    }

    @Override
    boolean isMeal() {
        return true;
    }
}
