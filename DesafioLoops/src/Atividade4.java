import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double saldo = scanner.nextDouble();
    double saque = scanner.nextDouble();
    double saqueRestante;
        //Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        //Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
            //TODO: Imprimir "Transação realizada com sucesso."
        } else {                
                saqueRestante = saque - saldo;
            if (saqueRestante > 0 && saqueRestante <= limiteChequeEspecial) {
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial."); 
            }
            else{
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
            //TODO: Verificar se o saque ultrapassa o limite do cheque especial
            //Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
            //Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
        }

        //Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
    
    

