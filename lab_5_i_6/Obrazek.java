package programowanie_zaawansowane.Lab.lab_5_i_6;

import ij.*; //biblioteka ImageJ
import ij.process.*;
import java.awt.Color;
import java.util.*; //tu jest geneator liczb losowych Random


public class Obrazek extends Plik {

    private int szerokosc, wysokosc;
    //private int rozmiar;

    public Obrazek(String nazwa,int szerokosc,int wysokosc) {
        super(nazwa);
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
        Setrozmiar(szerokosc*wysokosc);
    }
    public static void main(String[] args) {
        
    }

    public void Otwurz(ImagePlus imp){
        imp.show();
    }

    
}
