package org.gihae;

public class Dollar extends Money{

    private String currency;

    public Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    public String currency(){
        return currency;
    }

    public Money times(int multiplier){
        return new Dollar(amount * multiplier);
    }
}
