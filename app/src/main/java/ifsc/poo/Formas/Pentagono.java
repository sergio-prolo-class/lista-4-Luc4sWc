package ifsc.poo.Formas;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Pentagono extends FormaAbstrata {
    private final double []vert_x = new double [5];
    private final double []vert_y =  new double [5];
    private final double lado;
    private final double x1;
    private final double y1;

    public Pentagono(double centroX, double centroY, double halflength, boolean preenchido, Color cor) {
       super(centroX,centroY,preenchido,cor); //aqui usei polimorfismo !
       this.lado = halflength;

        for (int i = 0; i < 5; i++) {
            double angle = Math.toRadians(72 * i);
            vert_x[i] = centroX + lado * Math.cos(angle);
            vert_y[i] = centroY + lado * Math.sin(angle);
        }
        this.x1 = centroX;
        this.y1 = centroY;
    }

    public double getRaio() {
        // Distância do centro ao primeiro vértice
        return sqrt(pow(this.vert_x[0] - this.x1, 2) + pow(this.vert_y[0] - this.y1, 2));
    }


    @Override
    public void desenhar(Draw d) {
        d.setPenColor(cor);
        if (preenchido) {
            d.filledPolygon(this.vert_x,this.vert_y);
            d.setPenColor(Color.black);
            d.polygon(this.vert_x, this.vert_y);
        } else {
            d.polygon(this.vert_x, this.vert_y);
        }
    }

    @Override
    public void mover(double dx, double dy) {
        for (int i = 0; i < 5; i++) {
            this.vert_x[i] += dx;
            this.vert_y[i] += dy;
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
