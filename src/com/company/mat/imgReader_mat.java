package com.company.mat;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;


public class imgReader_mat {
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);//很重要
    }

    public static void main(String[] args) {

        Mat mat = Imgcodecs.imread("img/marvel10.jpg");
        ImageViewer viewer = new ImageViewer(mat);
        viewer.imshow();


    }
}
