package io.dowlath.designpatterns.strategy;

import java.io.File;
import java.util.ArrayList;

/**
 * @Author Dowlath
 * @create 5/13/2020 2:15 AM
 */
public class CompressionContext {

    private CompressionStrategy compressionStrategy;

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void compressArchive(String files){
        compressionStrategy.compressFiles(files);
    }

}
