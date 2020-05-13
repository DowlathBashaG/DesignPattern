package io.dowlath.designpatterns.builder;

/**
 * @Author Dowlath
 * @create 5/13/2020 5:08 AM
 */
public class BuilderPatternMain {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Dowlath","Basha").age(45).address("Bangalore").build();
        System.out.println(user);
    }
}
