package io.dowlath.designpatterns.decorator;

/**
 * @Author Dowlath
 * @create 5/13/2020 6:02 AM
 */
public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Basic Car....");
    }
}
