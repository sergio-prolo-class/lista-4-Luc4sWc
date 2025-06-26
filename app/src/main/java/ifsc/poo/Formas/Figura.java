package ifsc.poo.Formas;

import edu.princeton.cs.algs4.Draw;

public interface Figura {
    void desenhar(Draw d);
    void mover(double dx, double dy);
    double getArea();
    double getPerimetro();
}
