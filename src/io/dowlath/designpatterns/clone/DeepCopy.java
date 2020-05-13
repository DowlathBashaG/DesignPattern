package io.dowlath.designpatterns.clone;

import java.util.Arrays;

/**
 * @Author Dowlath
 * @create 5/13/2020 7:16 AM
 */
public class DeepCopy {
    private int[] data;

    DeepCopy(int[] values){
        data = new int[values.length];
        for(int i=0;i<data.length;i++){
            data[i] = values[i];
        }
    }

    public void showData(){
        System.out.println(Arrays.toString(data));
    }
}
