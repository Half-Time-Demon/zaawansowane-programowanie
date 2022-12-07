/**
 * Daniel Trojko, Student
 * lab_4
 */
package programowanie_zaawansowane.Lab.lab_4;

import java.util.Random;

public class Samochud {    

    private String marka;
    private int rok_produkcji,pojemnosc_silnika;
    private double cena;                     
    public int masa, kilometraz;
    public double vat;
    public Stan stan;
   

    public Samochud(){
        masa = 1024;
        kilometraz = 240;
        pojemnosc_silnika = 1828;
        rok_produkcji = 1996;
        String tablicy_producentów[] = {"Audi", "VW", "BMW", "Mercedes", "Toyota"};
        Random random = new Random();
        marka = tablicy_producentów[random.nextInt(tablicy_producentów.length)];
        cena = policzCene();
        vat = Samochod_Vat();
        stan = Stan.dobry;
    }

    public Samochud(String marka,int kilometraz,int pojemnosc_silnika){
        this.marka=marka;
        this.kilometraz=kilometraz;
        this.pojemnosc_silnika=pojemnosc_silnika;
        rok_produkcji = 1996;
        masa = 1024;
        cena = policzCene();
        stan = Stan.dobry;
    }

    public String getMarka(){
        return this.marka;
    }

    public int getRok_produkcji(){
        return this.rok_produkcji;
    }

    public int getPojemnosc_silnika(){
        return this.pojemnosc_silnika;
    }

    public void setMarka(String marka){
        this.marka=marka;
    } 

    public void setRok_produkcji(int rok_produkcji){
        this.rok_produkcji=rok_produkcji;
    }

    public void setPojemnosc_silnika(int pojemnosc_silnika){
        this.pojemnosc_silnika=pojemnosc_silnika;
    }

    public void jedź(int odleglosc){
        kilometraz+= odleglosc;
    }

    public void wyswietl(){
        System.out.println("marka : " + marka );
        System.out.println("rok produkcji : " + rok_produkcji );
        System.out.println("pojemnosc_silnika : " + pojemnosc_silnika );
        System.out.println("masa : " + masa );
        System.out.println("kilometraz : " + kilometraz );
        System.out.println();
        
    }

    private float policzCene() {
        return (float)(1/(2015-rok_produkcji+0.2)*100000); 
    }
    
    public double Samochod_Vat() {
        return Vat.oblicz_VAT(cena);
    }
}

