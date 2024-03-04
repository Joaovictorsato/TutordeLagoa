package modelo;
import java.awt.*;
public class Modeloalv extends Modelo {
    private int X=200;
    private int Y=100;
    public Modeloalv(){
        super(10, 100, 100);
    }

    public Modeloalv(int size,int posicaox, int posicaoy) {
        super(size, posicaox, posicaoy);
            
        
    }
    
    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

        public void Desenho(Graphics g){
        g.setColor(Color.red);
        g.fillOval(this.getPosicaox(), this.getPosicaoy(), this.getSize(), this.getSize());
        
    }


}
