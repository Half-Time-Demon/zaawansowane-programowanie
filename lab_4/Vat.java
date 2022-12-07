
package programowanie_zaawansowane.Lab.lab_4;

public class Vat {

    public static float stawka=0.21f;   
        
    public static double oblicz_VAT(double cena) {
        double cena_produktu = cena;
        return cena_produktu*stawka;
    }

}