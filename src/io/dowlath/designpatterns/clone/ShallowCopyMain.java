package io.dowlath.designpatterns.clone;

/**
 * @Author Dowlath
 * @create 5/13/2020 7:13 AM
 */
public class ShallowCopyMain {
    public static void main(String[] args) {
        int[] values = { 1,2,3};
        ShallowCopy sc = new ShallowCopy(values);
        sc.showData();
        values[2] = 1;
        sc.showData();  // expected output : 1,2,1 ( instead of 3 , last value copied as shallow.
    }
}
