package programowanie_zaawansowane.Lab.lab_5_i_6;

public class Dzwiek extends Plik {

    private float dlugosc;

    public Dzwiek(String nazwa,float dlugosc) {
        super(nazwa);
        this.dlugosc=dlugosc;
        Setrozmiar((int)(dlugosc*44100));
    }
    public static void main(String[] args) {
        
    }


    
}
