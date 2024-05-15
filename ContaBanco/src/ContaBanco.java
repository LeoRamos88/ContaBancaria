import java.util.Scanner;
public class ContaBanco {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Váriaveis 
    int numero;
    String agencia ;
    double saldo;


      //Coleta de caracteres 
      System.out.println("Olá ,seja bem vindo  ao banco!!");
      System.out.print("Por favor ,digite seu nome  : ");
      String nome = scanner.next();
      System.out.print("Por favor ,digite seu sobrenome : ");
      String sobreNome = scanner.next();

      String nomeCompleto = nomeCompleto(nome , sobreNome);

      
      System.out.print("Por favor ,digite o número da sua agencia :");
      agencia = scanner.next();
      System.out.print("Digite o número bancário :");
      numero = scanner.nextInt();

      System.out.print("Digite seu saldo :");
      saldo = Double.parseDouble(scanner.next());

      System.out.println("Olá " + nomeCompleto + " ,obrigado por criar uma conta em nosso banco ,sua âgencia é  " + agencia + " ,conta  " + numero +  "e seu saldo  " + saldo +" já esta disponível para saque. ");


    }
    public static String nomeCompleto(String nome ,String sobreNome ){
        return nome.concat(sobreNome);
    }
}
