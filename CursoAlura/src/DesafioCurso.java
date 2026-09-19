import java.awt.*;
import java.nio.channels.ConnectionPendingException;
import java.util.Scanner;

public class DesafioCurso {

    public void main( String[] args){
        int opcao = 0;
        double dinheiro;
        Scanner leitura = new Scanner(System.in);

        String cliente = "Guilherme Marmitt";
        double saldo = 2500;
        String tipoConta = "Corrente";

        System.out.println("\n**************************************************************************");
        System.out.println("Dados Iniciais do Cliente:\n");
        System.out.println("Nome: " + cliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldo);
        System.out.println("**************************************************************************\n");

        String menu = """
                Operações:
                
                1-Consultar Saldo
                2-Receber Valor
                3-Transferir Valor
                4-Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);

            System.out.println("Informe a opção desejada: ");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo da Conta: " + saldo + "\n");}
            else if (opcao == 2) {
                    System.out.println("Informe o valor do Depósito:");
                    dinheiro = leitura.nextDouble();
                    saldo = saldo+dinheiro; }
            else if (opcao == 3) {
                    System.out.println("Informe o valor Transferido:");
                    dinheiro = leitura.nextDouble();
                    saldo = saldo-dinheiro; }
            else if (opcao == 4) {
                break; }
            else {
                System.out.println("Informe uma opção válida");
            }
        }

    }
}
