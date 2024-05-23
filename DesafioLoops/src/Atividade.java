import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Qual opção você deseja?.");
            System.out.println("1 para Depositar.");
            System.out.println("2 para Sacar.");
            System.out.println("3 Para Consultar seu saldo.");
            System.out.println("4 para encerrar.");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                  Float valorDepositado;
                  System.out.println("qual o valor a ser depositado? ");
                  valorDepositado = scanner.nextFloat();
                  saldo= valorDepositado+saldo;
                  System.out.println("saldo atual: "+ saldo);
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    break;
                case 2:
                    float valorSaque;
                    System.out.println("qual o valor a ser sacado? ");
                    valorSaque= scanner.nextFloat();
                        if (valorSaque>saldo) {
                            System.out.println("saldo insuficiente.");
                        }
                        else{
                        saldo=saldo-valorSaque;
                        }
                    System.out.println("saldo atual: "+ saldo);
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    break;
                case 3:
                    System.out.println("Saldo atual é: " + saldo);
                    // TODO: Exibir o saldo atual da conta.
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}