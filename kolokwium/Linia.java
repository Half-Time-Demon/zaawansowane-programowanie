package programowanie_zaawansowane.Lab.kolokwium;

/**
 * @author Daniel Trojko
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.JFrame;


public class Linia {
    Punkt[] punkty = new Punkt[2];
    private String nazwaPunktu1_nazwaPunktu2;

    public String getNazwa() {
        return nazwaPunktu1_nazwaPunktu2;
    }

    public Linia() {
        this.punkty[0] = new Punkt();
        this.punkty[1] = new Punkt();
        this.nazwaPunktu1_nazwaPunktu2 = this.punkty[0].getNazwa() +       this.punkty[1].getNazwa();
    }
    
    public Linia(Punkt p1, Punkt p2) {
        this.punkty[0] = p1;
        this.punkty[1] = p2;
        this.nazwaPunktu1_nazwaPunktu2 = this.punkty[0].getNazwa() + this.punkty[1].getNazwa();
    }

    public double dlugosc() {
        double dx = punkty[1].getX() - punkty[0].getX();
        double dy = punkty[1].getY() - punkty[0].getY();
        return Math.sqrt(dx * dx + dy * dy);
      }
      
        public String toString() {
          return "Linia " + nazwaPunktu1_nazwaPunktu2 + ", A(" + this.punkty[0].getX() + ", " + this.punkty[0].getY() + ") B(" + this.punkty[1].getX() + ", " + this.punkty[1].getY() + ")";
        }
      
      }
      
      class Linia2 extends Linia {
        private int grubosc;
      
        public void setGrubosc(int grubosc) {
          this.grubosc = grubosc;
        }
      
        public int getGrubosc() {
          return this.grubosc;
        }
      
        public Linia2() {
          super();
          this.grubosc = 1; 
        }
      
        public Linia2(Punkt p1, Punkt p2, int grubosc) {
          super(p1, p2);
          this.grubosc = grubosc;
        }
      
        public String toString() {
          return "Linia " + this.getNazwa() + ", A(" + this.punkty[0].getX() + ", " + this.punkty[0].getY() + ") B(" + this.punkty[1].getX() + ", " + this.punkty[1].getY() + ")" + " Grubosc: " + this.grubosc;
        }
      }
      
      class Linia3 extends Linia2 {
        private Color kolor;
      
        public Color getKolor() {
          return this.kolor;
        }
      
        public Linia3() {
          super();
          setGrubosc(1);
          this.kolor = Color.black;
        }
      
        public void setColor(Color kolor) {
          this.kolor = kolor;
        }
      
        public Linia3(Punkt p1, Punkt p2, Color kolor) {
          super(p1, p2, 1);
          this.kolor = kolor;
        }
      
        public Linia3(Punkt p1, Punkt p2, int grubosc, Color kolor) {
          super(p1, p2, grubosc);
          this.kolor = kolor;
        }
      
        public String toString() {
          return "Linia " + this.getNazwa() + ", A(" + this.punkty[0].getX() + ", " + this.punkty[0].getY() + ") B(" + this.punkty[1].getX() + ", " + this.punkty[1].getY() + ")" + " Grubosc: " + getGrubosc() + " Kolor: " + this.kolor;
        }
      
         public void rysuj(){
          JFrame frame = new JFrame();
          frame.setSize(500, 500);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
          JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
              super.paintComponent(g);
              Graphics2D g2d = (Graphics2D) g;
              g2d.setColor(getKolor());
              g2d.setStroke(new java.awt.BasicStroke(getGrubosc()));
              g2d.drawLine((int)punkty[0].getX(), (int)punkty[0].getY(), (int)punkty[1].getX(), (int)punkty[1].getY());
              g2d.drawString(punkty[0].getNazwa(), (int) punkty[0].getX(), (int) punkty[0].getY());
              g2d.drawString(punkty[1].getNazwa(), (int) punkty[1].getX(), (int) punkty[1].getY());
            }
          };
      
          frame.add(panel);
          frame.setVisible(true);
        }
      
    
}
