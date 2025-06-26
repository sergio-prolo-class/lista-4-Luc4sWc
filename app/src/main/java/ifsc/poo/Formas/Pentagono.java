package ifsc.poo.Formas;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Pentagono implements Figura{
    private final double []x = new double [5];
    private final double []y =  new double [5];
    private final double lado;
    private final boolean preenchido;
    private final Color cor;
    private final double x1;
    private final double y1;

    public Pentagono(double centroX, double centroY, double halflength, boolean preenchido, Color cor) {
       this.lado = halflength;
       this.cor = cor;
       this.preenchido = true;

        for (int i = 0; i < 5; i++) {
            double angle = Math.toRadians(72 * i);
            x[i] = centroX + lado * Math.cos(angle);
            y[i] = centroY + lado * Math.sin(angle);
        }
        this.x1 = centroX;
        this.y1 = centroY;
    }

    public double getRaio() {
        // Distância do centro ao primeiro vértice
        return sqrt(pow(this.x[0] - this.x1, 2) + pow(this.y[0] - this.y1, 2));
    }


    @Override
    public void desenhar(Draw d) {
        d.setPenColor(cor);
        if (preenchido) {
            d.filledPolygon(this.x,this.y);
            d.setPenColor(Color.black);
            d.polygon(this.x, this.y);
        } else {
            d.polygon(this.x, this.y);
        }
    }

    @Override
    public void mover(double dx, double dy) {
        for (int i = 0; i < 5; i++) {
            this.x[i] += dx;
            this.y[i] += dy;
        }
    }

    @Override
    public double getArea() {
        return ((pow(getRaio(),2)) * sqrt(25 + 10 * sqrt(5)))/4;
    }

    @Override
    public double getPerimetro() {
        return 5 * getRaio();
    }
}
