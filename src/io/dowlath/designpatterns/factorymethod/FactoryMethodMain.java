package io.dowlath.designpatterns.factorymethod;

import java.util.Scanner;

/**
 * @Author Dowlath
 * @create 5/13/2020 7:07 AM
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        Scanner readCountry = new Scanner(System.in);
        System.out.print("Enter country name ... :  ");
        String country = readCountry.next();
        Currency rupee = CurrencyFactory.createCurrency(country);
        System.out.println(rupee.getSymbol());
    }
}
