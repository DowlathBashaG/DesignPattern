package io.dowlath.designpatterns.decorator;

/**
 * @Author Dowlath
 * @create 5/13/2020 6:04 AM
 */
public class SportsCar extends CarDecorator{
    SportsCar(Car car) {
        super(car);
    }
    public void assemble(){
        super.assemble();
        System.out.println("Adding features of Car");
    }
}
