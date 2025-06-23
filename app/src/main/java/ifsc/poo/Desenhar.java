package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

import javax.swing.*;

public class Desenhar {
    private final Draw draw = new Draw();
    private final int x = 1000;
    private final int y = 600;

    public Desenhar(){
        this.draw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.draw.setCanvasSize(this.x,this.y);
        this.draw.setXscale(0,this.x);
        this.draw.setYscale(0,this.y);
        this.draw.enableDoubleBuffering();
    }

    public void exibirTela(){
        this.draw.show();
    }


}
