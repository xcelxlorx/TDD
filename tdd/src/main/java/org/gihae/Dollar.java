package org.gihae;

public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
    }

    public String currency(){
        return "USD";
    }

    public Money times(int multiplier){
        return new Dollar(amount * multiplier);
    }
}
