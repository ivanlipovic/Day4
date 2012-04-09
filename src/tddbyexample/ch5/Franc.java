package tddbyexample.ch5;

public class Franc extends Money {
    Franc(int amount, String currency){
    	super(amount, currency);
    }
    
    Money times(int multiplier) {
      return Money.franc(amount * multiplier);
    }

public boolean equals(Object object) {
        Money money=(Money) object;
        return amount == money.amount;
}
}