package tech.itpark;

public class ATM {
    private int amountMoney;

    public ATM(int amountMoney) {
        this.amountMoney = amountMoney;
    }

    public int replenisment(int deposit) {
        amountMoney = amountMoney + deposit;
        return amountMoney;
    }

    public int withdrawal(int withdraw) {
        if (withdraw <= amountMoney) {
            amountMoney = amountMoney - withdraw;
            return withdraw;
        }
        return 0;

    }

}


