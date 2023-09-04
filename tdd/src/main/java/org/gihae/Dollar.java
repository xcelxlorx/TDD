package org.gihae;

public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object obj) {
        Money dollar = (Money) obj;
        return amount == dollar.amount;
    }
}
