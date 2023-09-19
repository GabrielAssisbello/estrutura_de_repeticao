import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;


public class CalculoDeMedia {

    public static void main(String[] args) {

        int n;

        do{
            n = parseInt(showInputDialog("qUANTOS ALUNOS VOCE TEM?  "));

        }while(n <= 0);

        for(int cont = 1; cont <= n; cont ++ ){
               double a1, a2, a3;
            do{
               a1 = parseDouble(showInputDialog("digite o valor da A1: "));
            }while (a1 < 0 || a1 > 30);

            do{
               a2 = parseDouble(showInputDialog("digite o valor da A2: "));
            }while (a2 < 0 || a2 > 30);

            do{
               a3 = parseDouble(showInputDialog("digite o valor da A3: "));
            }while (a3 < 0 || a3 > 30);

            double media = a1 + a2 + a3;
            showMessageDialog(null, "Media: " + media);

            if(media >= 70){
                showMessageDialog(null, "aprovado");
            }
            else{
                showMessageDialog(null, "reprovado");
            }

        }

    }
}


