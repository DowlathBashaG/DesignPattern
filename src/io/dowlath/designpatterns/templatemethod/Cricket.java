package io.dowlath.designpatterns.templatemethod;

/**
 * @Author Dowlath
 * @create 5/13/2020 3:08 AM
 */
public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("Initialize Cricket...");
    }

    @Override
    void startGame() {
        System.out.println("Start Cricket Game ...");
    }

    @Override
    void endGame() {
        System.out.println("Start Criket Game ...");
    }
}
