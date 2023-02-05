package programowanie_zaawansowane.Lab.lab_5_i_6;

public class Test {
    public static void main(String[] args) {
        Plik plik1 = new Plik("plik1");

        Plik plik2 = new Plik("plik2");

        Plik plik3 = new Plik("plik3");


        plik1.zapelnij(false);
        plik1.zmien_rozszerzenie(".cvs");
        
        plik2.zmien_nazwe("nie_plik_1");
        plik2.randomizuj(30);
        System.out.println(plik2.toString());
        plik2.zapelnij(false);

        plik3.randomizuj(40);
        System.out.println(plik3.toString());
        plik3.zapelnij(true);
        plik3.otwuz();

        System.out.println(plik1.toString());
        System.out.println(plik2.toString());
        System.out.println(plik3.toString());
    }
}
