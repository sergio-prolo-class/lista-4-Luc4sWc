package ifsc.poo.Formas;
import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import static java.lang.Math.PI;

public class Circulo implements Figura { //aqui usei polimorfismo !
    private double x;
    private double y;
    private final double radius;
    private boolean preenchido;
    private Color cor;

    public Circulo(double x, double y, double radius, boolean preenchido, Color cor) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.preenchido = preenchido;
        this.cor = cor;
    }

    @Override
    public void desenhar(Draw d) {
        d.setPenColor(Color.BLACK);
        if (preenchido) {
            d.filledCircle(this.x, this.y, this.radius);
            d.setPenColor(cor);
            d.filledCircle(this.x, this.y, this.radius/1.1);
        } else {
            d.circle(this.x, this.y, this.radius);
        }
    }

    @Override
    public void mover(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public double getArea() {
        return PI * (radius * radius);
    }

    @Override
    public double getPerimetro() {
        return 2 * PI * radius;
    }
}