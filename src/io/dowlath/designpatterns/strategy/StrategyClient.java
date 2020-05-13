package io.dowlath.designpatterns.strategy;

/**
 * @Author Dowlath
 * @create 5/13/2020 2:29 AM
 */
public class StrategyClient {
    public static void main(String[] args) {
        CompressionContext context = new CompressionContext();
        context.setCompressionStrategy(new WarCompression());
        context.compressArchive("Warfile");
        // context.setCompressionStrategy(new ZipCompression());
        //  context.compressArchive("Zipfile");
        // context.setCompressionStrategy(new JarCompression());
       // context.compressArchive("Jarfile");
    }
}
