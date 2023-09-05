package org.gihae;

public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount;
    }
}
