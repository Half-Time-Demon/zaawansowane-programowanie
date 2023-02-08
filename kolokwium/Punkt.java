package programowanie_zaawansowane.Lab.kolokwium;

/**
 * @author Daniel Trojko
 */
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Punkt{
    private float x;
    private float y;
    private String nazwa;

    public Punkt(){
        Random rnd = new Random();
        this.x = rnd.nextFloat() * (200-100); 
        this.y = rnd.nextFloat() * (200-100);
        this.nazwa = Generator.pobierz();
    }
    public Punkt(float x, float y, String nazwa){
        this.x = x;
        this.y = y;
        this.nazwa = nazwa;
    }
    //Gettery
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public String getNazwa(){
        return nazwa;
    }
    //Settery
    public void setX(float x){
        this.x=x;
    }
    public void setY(float y){
        this.y=y;
    }
    public void setNazwa(String nazwa){
        this.nazwa=nazwa;
    }
    public void rysuj(){
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.drawString(getNazwa(), (int) getX()-20, (int) getY()+20);
                g2d.drawLine((int)getX(), (int)getY(), (int)getX(), (int)getY());
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }

    public String toString(){
          String opis="";
                 opis += "\n Rezultat:" + nazwa + "x:" + x + "y:" + y;

          return opis;
    }



    public static void main(String[] args) {

        Punkt punkt1=new Punkt();
        Punkt punkt2=new Punkt();
        punkt1.rysuj();
        punkt2.rysuj();
    }

}