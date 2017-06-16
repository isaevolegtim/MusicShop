package com.epam.oi.rates;

public class RatesList {
    public static void main(String[] args) {

        StandardRate standart = new StandardRate(); //The information about Standard Rate
        standart.standardRate();

        System.out.println();

        AdvancedRate advance = new AdvancedRate(); //The information about Advanced Rate
        advance.advancedRate();

        System.out.println();

        UnlimitedRate unlimited = new UnlimitedRate(); // The information about Unlimited Rate
        unlimited.unlimitedRate();
    }
}
