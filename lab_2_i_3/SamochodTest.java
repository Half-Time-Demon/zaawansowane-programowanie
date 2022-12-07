/**
 * Daniel Trojko, Student
 * lab_4
 */
package programowanie_zaawansowane.Lab.lab_2_i_3;

public class SamochodTest {
    public static void main(String[] args) {
        Samochud samochud_1 = new Samochud(); 
        Samochud samochud_2 = new Samochud("dodge",336,2804);
        
        samochud_1.wyswietl();
        samochud_2.wyswietl();

        samochud_1.masa=3000;
        samochud_1.kilometraz=200;
        samochud_1.setMarka("samsam");

        samochud_1.wyswietl();

        Samochud tablica[] = new Samochud[10];

        for (int i = 0; i < tablica.length; i++) {
            Samochud tmp = new Samochud(); 
            tablica[i]=tmp;
        }

        for (int i = 0; i < tablica.length; i++) {
            tablica[i].wyswietl();
        }
        
    }
}
