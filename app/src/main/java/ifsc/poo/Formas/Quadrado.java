package ifsc.poo.Formas;
import edu.princeton.cs.algs4.Draw;
import java.awt.*;

public class Quadrado implements Figura {
    private double x;
    private double y;
    private final double lado;
    private boolean preenchido;
    private Color cor;

    public Quadrado(double x, double y, double halflength, boolean preenchido, Color cor) {
        this.x = x;
        this.y = y;
        this.lado = halflength;
        this.preenchido = preenchido;
        this.cor = cor;
    }


    @Override
    public void desenhar(Draw d) {
        d.setPenColor(Color.BLACK);
        if (preenchido) {
            d.filledSquare(this.x,this.y,this.lado);
            d.setPenColor(cor);
            d.filledSquare(this.x, this.y,this.lado/1.1);
        } else {
            d.square(this.x, this.y, this.lado/1.1);
        }
    }

    @Override
    public void mover(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }
}