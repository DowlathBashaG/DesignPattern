package io.dowlath.designpatterns.templatemethod;

/**
 * @Author Dowlath
 * @create 5/13/2020 3:08 AM
 */
public class Tennis extends Game {
    @Override
    void initialize() {
        System.out.println("Initialize Tennis...");
    }

    @Override
    void startGame() {
        System.out.println("Start Tennis Game ...");
    }

    @Override
    void endGame() {
        System.out.println("End Tennis Game ...");
    }
}
