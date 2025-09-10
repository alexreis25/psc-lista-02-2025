import java.util.Scanner;

public class ex05 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Preço viagem Alemanha: R$");
    double viagemAle = scanner.nextDouble();

    System.out.print("Preço viagem Portugal: R$");
    double viagemPort = scanner.nextDouble();

    System.out.print("Preço viagem Italia: R$");
    double viagemIta = scanner.nextDouble();

    System.out.print("Quantidade de pessoas que irão viajar: ");
    int quantidadePessoas = scanner.nextInt();

    double valorTotal = (viagemAle + viagemPort + viagemIta) * quantidadePessoas;

    System.out.println("O valor total da viagem para " + quantidadePessoas + " Pessoas foi de : R$" + valorTotal);

     scanner.close();

  }


}
