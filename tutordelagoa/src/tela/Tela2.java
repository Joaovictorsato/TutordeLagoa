package tela;
import javax.swing.JPanel;
import modelo.Modeloat;
import modelo.Modeloalv;
import java.awt.*;

public class Tela2 extends JPanel{
   
   Modeloalv alvo = new Modeloalv(80, 5, 400);
   Modeloat atirador = new Modeloat(80, 500, 400);

   
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      this.setBackground(Color.white);
      alvo.Desenho(g);
      atirador.Desenho(g);
   }
   

}
