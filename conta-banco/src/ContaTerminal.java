import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

   
   String nomeCliente = "";
   int numeroConta = 1025;
   int Agêcia = 067-8;
   double Saldo = 5568;

   
    public static void main(String[] args) {
        try (
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Para iniciar seu cadastro digite seu nome ");
            String NomeCliente = scanner.next();
            
            System.out.println("Por favor, digite o número da Agêcia ");
            String Agencia = scanner.next();

            System.out.println("Insira o número da sua conta");
            int numeroConta = scanner.nextInt();
            
            System.out.println("Para finalizar digite seu Saldo");
            double Saldo = scanner.nextDouble();

            System.out.println("Ola " + NomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + numeroConta + " e seu saldo " + Saldo + " já está disponivel para saque");
            
        }
        
        
    }
}


     
        
    

