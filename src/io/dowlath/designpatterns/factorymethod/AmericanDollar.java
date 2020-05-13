package io.dowlath.designpatterns.factorymethod;

/**
 * @Author Dowlath
 * @create 5/13/2020 7:00 AM
 */
public class AmericanDollar implements Currency{
    @Override
    public String getSymbol() {
        return "US Dollar";
    }
}
