
import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tela.NumericFilter;
import modelo.Modeloalv;
import tela.Tela;

public class Main {
    public static void main(String[] args) {
        JTextField textAngulo = new JTextField(8);
        JTextField textDistancia = new JTextField(8);
        JButton botao = new JButton("Atirar");
        Tela tela = new Tela();
        Modeloalv alvo = new Modeloalv();
        NumericFilter numeros = new NumericFilter();
        
        ((AbstractDocument) textAngulo.getDocument()).setDocumentFilter(numeros);
        ((AbstractDocument) textDistancia.getDocument()).setDocumentFilter(numeros);

        JFrame jframe = new JFrame();
        jframe.setTitle("Pond Game");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500, 500);
        jframe.setVisible(true);
        jframe.setLocationRelativeTo(null);
        

        tela.add(new JLabel("PosicaoX: "));
        tela.add(textAngulo);
        tela.add(new JLabel("PosicaoY: "));
        tela.add(textDistancia);
        tela.add(botao);
        jframe.add(tela);
       

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          try{
                int angulo = Integer.parseInt(textAngulo.getText());
                int distancia = Integer.parseInt(textDistancia.getText());

                if (angulo <= 0 || distancia <= 0) {
                  JOptionPane.showMessageDialog(null, "os Numeros não podem ser 0", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                  return; 
              }
               if(angulo==alvo.getX()&& distancia==alvo.getY()) {
                JOptionPane.showMessageDialog(null, "Voce acertou", "Voce Ganhou", JOptionPane.INFORMATION_MESSAGE);
                  return; 
                
              }else if(angulo!=alvo.getX()||distancia!=alvo.getY()){
                JOptionPane.showMessageDialog(null, "Voce Errou", "Voce Perdeu", JOptionPane.ERROR_MESSAGE);
                return; 
              }
              
            } catch(NumberFormatException ex){
              JOptionPane.showMessageDialog(null, "Por favor, insira apenas números válidos nos campos de texto.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
              return;
            }
            
                
            }
        });
    }
}



