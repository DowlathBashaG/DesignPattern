package io.dowlath.designpatterns.strategy;

import java.io.File;
import java.util.ArrayList;

/**
 * @Author Dowlath
 * @create 5/13/2020 2:10 AM
 */
public interface CompressionStrategy {
    public void compressFiles(String files);
}
