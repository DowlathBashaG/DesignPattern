package io.dowlath.designpatterns.clone;

import java.util.Arrays;

/**
 * @Author Dowlath
 * @create 5/13/2020 7:12 AM
 */
public class ShallowCopy {
    private int[] data;
    ShallowCopy(int[] data){
        this.data = data;
    }
    public void showData(){
        System.out.println(Arrays.toString(data));
    }
}
