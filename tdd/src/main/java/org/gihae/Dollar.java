package org.gihae;

public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount;
    }
}
