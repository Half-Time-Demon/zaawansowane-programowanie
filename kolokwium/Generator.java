package programowanie_zaawansowane.Lab.kolokwium;

/**
 * @author Daniel Trojko
 */

import java.util.ArrayList;
import java.util.Random;

public class Generator {
    private static ArrayList<String> list = new ArrayList<String>();
    ;

    public static String pobierz(){
        String liczbaString;
        Random liczba = new Random();
        liczbaString=Character.toString(liczba.nextInt(26) + 65);
        if(list.isEmpty()){
            list.add(liczbaString);
        }else{
            if(!list.contains(liczbaString)){
                list.add(liczbaString);
            }else{
                pobierz();
            }
        }
        return liczbaString;
    }
}
