package org.gihae;

public class Franc extends Money{

    private String currency;

    public Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
    }

    public String currency(){
        return currency;
    }

    public Money times(int multiplier){
        return new Franc(amount * multiplier);
    }
}
