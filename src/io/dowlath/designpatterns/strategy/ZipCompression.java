package io.dowlath.designpatterns.strategy;

import java.io.File;
import java.util.ArrayList;

/**
 * @Author Dowlath
 * @create 5/13/2020 2:11 AM
 */
public class ZipCompression implements CompressionStrategy{
    @Override
    public void compressFiles(String files) {
        System.out.println("CompressedFile under Zipcompression" + files);
    }
}
