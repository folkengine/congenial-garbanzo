package com.electronicpanopticon.smile;

import smile.data.AttributeDataset;
import smile.data.parser.ArffParser;

public class Mess {

    public void goAlong() throws Exception {
        ArffParser arffParser = new ArffParser();
        arffParser.setResponseIndex(4);
        AttributeDataset weather = arffParser.parse(new java.io.File("src/test/resources/data/weka/weather.nominal.arff"));
        double[][] x = weather.toArray(new double[weather.size()][]);
        int[] y = weather.toArray(new int[weather.size()]);
    }

    public static void main(String... args) throws Exception {
        Mess mess = new Mess();
        mess.goAlong();
    }

}
