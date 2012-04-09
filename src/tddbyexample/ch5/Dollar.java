package tddbyexample.ch5;

public class Dollar extends Money {
	Dollar(int amount, String currency) {
		super(amount, currency);
	}

	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount;
	}
}