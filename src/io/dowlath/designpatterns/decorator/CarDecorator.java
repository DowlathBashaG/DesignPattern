package io.dowlath.designpatterns.decorator;

/**
 * @Author Dowlath
 * @create 5/13/2020 6:03 AM
 */
public class CarDecorator implements Car {
    Car car;
    CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
