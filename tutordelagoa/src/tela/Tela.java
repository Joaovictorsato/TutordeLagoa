package tela;
import javax.swing.JPanel;
import modelo.Modeloat;
import modelo.Modeloalv;
import java.awt.*;

public class Tela extends JPanel{
   Modeloalv alvo = new Modeloalv(80, 200, 100);
   Modeloat atirador = new Modeloat(80, 200, 400);
   
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      this.setBackground(Color.white);
      alvo.Desenho(g);
      atirador.Desenho(g);
   }
   

}
