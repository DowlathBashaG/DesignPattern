package io.dowlath.designpatterns.templatemethod;

/**
 * @Author Dowlath
 * @create 5/13/2020 3:06 AM
 */
public abstract class Game {
    abstract void initialize();
    abstract void startGame();
    abstract void endGame();

    public final void play(){
        initialize();
        startGame();
        endGame();
    }
}
