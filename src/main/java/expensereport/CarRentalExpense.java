package expensereport;

/**
 * Created by jojonari on 2017. 5. 16..
 */
public class CarRentalExpense extends Expense {
    public CarRentalExpense(int amount) {
        super(Type.CAR_RENTAL, amount);
    }

    @Override
    boolean isOverage() {
        return false;
    }

    @Override
    String getName() {
        return "Car Rental";
    }

    @Override
    boolean isMeal() {
        return false;
    }
}
