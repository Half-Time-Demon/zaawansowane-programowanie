/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrazki;
import ij.*; //biblioteka ImageJ
import ij.process.*;
import java.awt.Color;
import java.util.*; //tu jest geneator liczb losowych Random

/**
 *
 * @author student
 */
public class Obrazki {

    /**
     * @param args the command line arguments
     */
    static int[][] genRandomPixels(int width, int height){
        int[][] result = new int[width][height];
        Random r = new Random();
        for (int i=0; i<width; i++)
            for (int j=0; j<height; j++)
                result[i][j]=r.nextInt(256);
        
        return result;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] pixels = genRandomPixels(800,600);
        s imp = IJ.createImage("Test", "8-bit", 800, 600, 1);
        ImageProcessor ip = imp.getProcessor();
        ip.setIntArray(pixels);
        //imp.draw();  
        imp.show();
        //imp.close();
    }
    
}
