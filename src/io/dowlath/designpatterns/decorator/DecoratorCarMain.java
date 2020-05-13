package io.dowlath.designpatterns.decorator;

/**
 * @Author Dowlath
 * @create 5/13/2020 6:07 AM
 */
public class DecoratorCarMain {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
    }
}
