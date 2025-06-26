package ifsc.poo.Formas;
import edu.princeton.cs.algs4.Draw;
import java.awt.*;

public class Quadrado extends FormaAbstrata {
    private final double lado;

    public Quadrado(double x, double y, double halflength, boolean preenchido, Color cor) {
        super(x,y,preenchido,cor); //aqui usei polimorfismo !
        this.lado = halflength;
    }


    @Override
    public void desenhar(Draw d) {
        if (preenchido) {
            d.setPenColor(Color.BLACK);
            d.filledSquare(this.x,this.y,this.lado);
            d.setPenColor(cor);
            d.filledSquare(this.x, this.y,this.lado/1.1);
        } else {
            d.setPenColor(cor);
            d.square(this.x, this.y, this.lado);
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