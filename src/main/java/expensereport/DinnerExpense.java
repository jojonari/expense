package expensereport;

/**
 * Created by jojonari on 2017. 5. 16..
 */
public class DinnerExpense extends Expense {
    public DinnerExpense(int amount) {
        super(Type.DINNER, amount);
    }

    @Override
    boolean isOverage() {
        return (amount > 5000);
    }

    @Override
    String getName() {

        return "Dinner";
    }

    @Override
    boolean isMeal() {
        return true;
    }
}
