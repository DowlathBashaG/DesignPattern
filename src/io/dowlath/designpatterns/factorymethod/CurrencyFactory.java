package io.dowlath.designpatterns.factorymethod;

/**
 * @Author Dowlath
 * @create 5/13/2020 7:02 AM
 */
public class CurrencyFactory {
    public static Currency createCurrency(String country){
        if(country.equalsIgnoreCase("India")) {
            return new Rupee();
        } else if (country.equalsIgnoreCase("Singapore")){
            return new SingaporeDollar();
        } else if(country.equalsIgnoreCase("America")){
            return new AmericanDollar();
        }
        throw new IllegalArgumentException("No such country");
    }
}
