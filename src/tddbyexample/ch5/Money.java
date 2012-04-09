package tddbyexample.ch5;

abstract class Money {
abstract String currency();
abstract Money times(int multiplier);
	protected int amount;
	public boolean equals(Object object) {
		Money money= (Money) object;
		return amount == money.amount
		&& getClass().equals(money.getClass());	
	}
	static Money dollar(int amount) {
		return new Dollar(amount);
	}
	static Money franc(int amount) {
		return new Franc(amount);
	}
}

