package tddbyexample.ch5;

abstract class Money {
abstract Money times(int multiplier);
	protected String currency;
	String currency() {
		return currency;
	}
	protected int amount;
	public boolean equals(Object object) {
		Money money= (Money) object;
		return amount == money.amount
		&& getClass().equals(money.getClass());	
	}
	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
}

