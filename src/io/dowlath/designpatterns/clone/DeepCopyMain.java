package io.dowlath.designpatterns.clone;

/**
 * @Author Dowlath
 * @create 5/13/2020 7:18 AM
 */
public class DeepCopyMain {
    public static void main(String[] args) {
        int[] val = {1,2,3};
        DeepCopy dc = new DeepCopy(val);
        dc.showData();   // 1,2,3
        val[2] = 1;    // after updating value for position @2nd instead of 3 , 1. But it wont take.
        dc.showData();
    }
}
