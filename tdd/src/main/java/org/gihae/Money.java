package org.gihae;

public abstract class Money {
    protected int amount;
    public abstract Money times(int multiplier);
    public abstract String currency();

    public static Money dollar(int amount){
        return new Dollar(amount);
    }

    public static Money franc(int amount){
        return new Franc(amount);
    }

    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}


