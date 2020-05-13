package io.dowlath.designpatterns.templatemethod;

/**
 * @Author Dowlath
 * @create 5/13/2020 3:08 AM
 */
public class Hokey extends Game{
    @Override
    void initialize() {
        System.out.println("Initialize Hokey...");
    }

    @Override
    void startGame() {
        System.out.println("Start Hokey Game ...");
    }

    @Override
    void endGame() {
        System.out.println("Start Hokey Game ...");
    }
}
