package programowanie_zaawansowane.Lab.lab_5_i_6;

import java.util.Random;
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class Plik {

    private String Nazwa;
    private String Rozszerzenia;
    private int Rozmiar;
    private String Zavartosc;

    public Plik(String nazwa){
        this.Nazwa=nazwa;
        Rozszerzenia=".file";
        Rozmiar=0;
        Zavartosc="";
    }

    public static void main(String[] args) {
        
    }
    
    public void zapelnij(boolean czy_nadpisac){
        String tmp;

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Proszę podać zawartość pliku jako symbole z klawiatury i w końcu nacisnąć ENTER");
            tmp = in.nextLine();
        }
 
        if((this.Rozmiar>0)&&(czy_nadpisac=true)){
            Zavartosc=tmp;
            Rozmiar=tmp.length();
        }else if((this.Rozmiar>0)&&(czy_nadpisac=false)){
            Zavartosc += tmp;
            Rozmiar+=tmp.length();
        }else{
            Zavartosc=tmp;
            Rozmiar=tmp.length();
        }
    }

    public void  randomizuj(int ilosc){
        StringBuilder tmp = new StringBuilder();
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random rnd = new Random();
        while (tmp.length() < ilosc) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            tmp.append(SALTCHARS.charAt(index));
        }

        this.Zavartosc = tmp.toString();
        this.Rozmiar=ilosc;
    }

    public void Otwurz(){
        System.out.println(this.Zavartosc);
    }

    public void zmien_nazwe(String nowa_nazwa){
        this.Nazwa = nowa_nazwa;
    }

    public void zmien_rozszerzenie(String nowe_roz){
        this.Rozszerzenia = nowe_roz;
    }

    public void Setrozmiar(int rozmiar){
        this.Rozmiar = rozmiar;
    }

    public String toString(){
        return "Informacja o pliku :\n Nazwa pliku: "+this.Nazwa+"\n Rozszerzenie pliku: "+this.Rozszerzenia +"\n Rozmiar pliku:"+this.Rozmiar + "\n Podgląd pliku:\n"+this.Zavartosc.substring(0,10)+"...";
    }

    public void zapisz(){
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
