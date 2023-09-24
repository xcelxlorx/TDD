package org.gihae;

public abstract class Money {

    protected int amount;
    protected String currency;

    public abstract Money times(int multiplier);

    public String currency(){
        return currency;
    }
    public static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount){
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}


