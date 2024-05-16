import br.com.fiap.faculdade.model.Bacharelado;
import br.com.fiap.faculdade.model.Formacao;
import br.com.fiap.faculdade.model.Medio;
import br.com.fiap.faculdade.model.Tecnologo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


         String pergunta = JOptionPane.showInputDialog(null, "Qual formação você deseja?(Tecnologo, Bacharelado ou Medio)");
         if(pergunta.equalsIgnoreCase("Tecnologo")){
             Tecnologo tecnologo = new Tecnologo("RH", 36,1500,36,false);
             JOptionPane.showMessageDialog(null, tecnologo);
         } else if (pergunta.equalsIgnoreCase("Bacharelado")) {
             Bacharelado bacharelado = new Bacharelado("Engenharia de Produção",46,3500,46,"AIA",200);
             JOptionPane.showMessageDialog(null, bacharelado);
         } else if (pergunta.equalsIgnoreCase("Medio")) {
             Medio medio = new Medio("Medio",36,0,36,"Nop");
             JOptionPane.showMessageDialog(null, medio);
         }
         else {
             JOptionPane.showMessageDialog(null, "Não existe a formação mencionada");
         }
    }
}