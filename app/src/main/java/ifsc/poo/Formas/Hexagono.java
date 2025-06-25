package ifsc.poo.Formas;
import edu.princeton.cs.algs4.Draw;
import java.awt.*;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Hexagono implements Figura { //aqui usei polimorfismo !
    private double []x = new double [6];
    private double []y = new double [6];
    private final double lado;
    private boolean preenchido;
    private Color cor;

    public Hexagono(double centroX, double centroY, double halflength, boolean preenchido, Color cor) {
        this.lado = halflength;
        this.preenchido = preenchido;
        this.cor = cor;

        for (int i = 0; i < 6; i++) {
            double angle = Math.toRadians(60 * i);
            x[i] = centroX + lado * Math.cos(angle);
            y[i] = centroY + lado * Math.sin(angle);
        }
    }

    private double getRaio() {
        return Math.hypot(x[0] - x[3], y[0] - y[3]) / 2;
    }

    @Override
    public void desenhar(Draw d) {
        d.setPenColor(cor);
        if (preenchido) {
            d.filledPolygon(this.x, this.y);
            d.setPenColor(Color.black);
            d.polygon(this.x,this.y);

        } else {
            d.polygon(this.x, this.y);
        }
    }

    @Override
    public void mover(double dx, double dy) {
        for (int i = 0; i < 6; i++) {
            this.x[i] += dx;
            this.y[i] += dy;
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