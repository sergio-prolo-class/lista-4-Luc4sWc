package ifsc.poo.Formas;
import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import static java.lang.Math.PI;

public class Circulo extends FormaAbstrata {
    private final double radius;

    public Circulo(double x, double y, double radius, boolean preenchido, Color cor) {
        super(x,y,preenchido,cor); //aqui usei polimorfismo !
        this.radius = radius;
    }

    @Override
    public void desenhar(Draw d) {
        if (preenchido) {
            d.setPenColor(Color.BLACK);
            d.filledCircle(this.x, this.y, this.radius);
            d.setPenColor(cor);
            d.filledCircle(this.x, this.y, this.radius/1.1);
        } else {
            d.setPenColor(cor);
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