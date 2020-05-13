package io.dowlath.designpatterns.templatemethod;

/**
 * @Author Dowlath
 * @create 5/13/2020 3:12 AM
 */
public class TemplateMethodMain {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        game = new Hokey();
        game.play();

        game = new Tennis();
        game.play();
    }
}
