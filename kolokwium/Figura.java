package programowanie_zaawansowane.Lab.kolokwium;

/**
 * @author Daniel Trojko
 */

import java.io.Console;
import java.lang.reflect.Constructor;

public class Figura {
    private Punkt[] wierzcholki;
    private Linia[] boki;
    private String typ;


    int ilosc_wieszcholkuw=3;

    public Figura(){
        wierzcholki = new Punkt[ilosc_wieszcholkuw-1];
        boki = new Linia[ilosc_wieszcholkuw-1];
        for(int i=0;i<=2;i++){
            wierzcholki[i] = new Punkt();
        }

        for(int i=0;i<=ilosc_wieszcholkuw-1;i++){
            if(i==ilosc_wieszcholkuw-1){
                boki[i] = new Linia(wierzcholki[i],wierzcholki[(i-(ilosc_wieszcholkuw-1))+1]);
            }else{
                boki[i] = new Linia(wierzcholki[i],wierzcholki[i+1]);
            }   
        }
        this.typ="Trókąt";
    }

    public Figura(Punkt[] punkty){
        if(ilosc_wieszcholkuw==3){
            System.out.println("Nieobsługiwana ilość punktów. Zostanie stworzony randomowy trójkąt");
        }else{
            
        }
    }
    
}
