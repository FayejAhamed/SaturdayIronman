package com.upskill.asignment_3;




class Bank {
    public double getInterestRate() {
        return 0.0;
    }
}

class ChaseBank extends Bank {
    @Override
    public double getInterestRate() {
        return 0.08; // 8% interest rate for Chase Bank
    }
}

class CityBank extends Bank {
    @Override
    public double getInterestRate() {
        return 0.07; // 7% interest rate for City Bank
    }
}

class TDBank extends Bank {
    @Override
    public double getInterestRate() {
        return 0.09; // 9% interest rate for TD Bank
    }
}

public class BankInterestRateDemo {
    public static void main(String[] args) {
        ChaseBank chaseBank = new ChaseBank();
        CityBank cityBank = new CityBank();
        TDBank tdBank = new TDBank();

        System.out.println("Chase Bank Interest Rate: " + (chaseBank.getInterestRate() * 100) + "%");
        System.out.println("City Bank Interest Rate: " + (cityBank.getInterestRate() * 100) + "%");
        System.out.println("TD Bank Interest Rate: " + (tdBank.getInterestRate() * 100) + "%");
    }
}
