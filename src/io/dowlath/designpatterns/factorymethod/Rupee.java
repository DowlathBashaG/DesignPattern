package io.dowlath.designpatterns.factorymethod;

/**
 * @Author Dowlath
 * @create 5/13/2020 6:59 AM
 */
public class Rupee implements Currency{
    @Override
    public String getSymbol() {
        return "Indian Rs.";
    }
}
