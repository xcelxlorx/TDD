package org.gihae;

public class Franc extends Money{

    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = "CHF";
    }

    public String currency(){
        return currency;
    }

    public Money times(int multiplier){
        return new Franc(amount * multiplier, null);
    }
}
