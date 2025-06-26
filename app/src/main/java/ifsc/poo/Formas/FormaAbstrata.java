package ifsc.poo.Formas;

import java.awt.*;

public abstract class FormaAbstrata implements Figura {
    protected double x, y;
    protected Color cor;
    protected boolean preenchido;

    public FormaAbstrata(double x, double y, boolean preenchido, Color cor) {
        this.x = x;
        this.y = y;
        this.preenchido = preenchido;
        this.cor = cor;
    }

    public void setCor(Color novaCor) {
        this.cor = novaCor;
    }

    public void setPreenchido(boolean novoEstado) {
        this.preenchido = novoEstado;
    }

    public Color getCor() {
        return cor;
    }

    public boolean isPreenchido() {
        return preenchido;
    }
}
