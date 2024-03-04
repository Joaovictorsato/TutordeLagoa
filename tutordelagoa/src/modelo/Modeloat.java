package modelo;
import java.awt.*;

public class Modeloat extends Modelo {
    
    public Modeloat(){
        super(10, 100, 100);
    }

    public Modeloat(int size,int posicaox, int posicaoy) {
        super(size, posicaox, posicaoy);
            
        
    }
    public void Desenho(Graphics g){
        g.setColor(Color.green);
        g.fillOval(this.getPosicaox(), this.getPosicaoy(), this.getSize(), this.getSize());
        
    }

}

   

