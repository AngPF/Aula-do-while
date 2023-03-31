import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Produto produto;

        boolean encerrar = false ;

        String nome = "";
        double valor = 0;
        double total = 0;

        do {
            nome = JOptionPane.showInputDialog("Nome do produto: ");

            valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto"));

           produto = new Produto(nome, valor);

            System.out.println(produto);

            total = total + produto.getValor();

            var opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja mais alguma coisa?" +
                    "[ 1 ] = sim" +
                    "[ 0 ] = Não"));

            encerrar = opcao == 1? false : true;

        }while (encerrar == false);

        System.out.println(" Total da compra: " + total);

    }
}