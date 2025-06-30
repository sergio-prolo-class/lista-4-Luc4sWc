package ifsc.poo.Formas;
import edu.princeton.cs.algs4.Draw;
import java.awt.*;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Hexagono extends FormaAbstrata {
    private double []vert_x = new double [6];
    private double []vert_y = new double [6];
    private final double lado;

    public Hexagono(double centroX, double centroY, double halflength, boolean preenchido, Color cor) {
        super(centroX,centroY,preenchido,cor); //aqui usei polimorfismo !
        this.lado = halflength;

        for (int i = 0; i < 6; i++) {
            double angle = Math.toRadians(60 * i);
            vert_x[i] = centroX + lado * Math.cos(angle);
            vert_y[i] = centroY + lado * Math.sin(angle);
        }
    }

    private double getRaio() {
        return Math.hypot(vert_x[0] - vert_x[3], vert_y[0] - vert_y[3]) / 2;
    }

    @Override
    public void desenhar(Draw d) {
        d.setPenColor(cor);
        if (preenchido) {
            d.filledPolygon(this.vert_x, this.vert_y);
            d.setPenColor(Color.black);
            d.polygon(this.vert_x,this.vert_y);

        } else {
            d.polygon(this.vert_x, this.vert_y);
        }
    }

    @Override
    public void mover(double dx, double dy) {
        for (int i = 0; i < 6; i++) {
            this.vert_x[i] += dx;
            this.vert_y[i] += dy;
        }
    }

    @Override
    public double getArea() {
        return ((3 * sqrt(3) * pow(getRaio(),2)) / 2);
    }

    @Override
    public double getPerimetro() {
        return 6 * getRaio();
    }
}
