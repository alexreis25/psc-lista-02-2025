import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço atual da gasolina: R$");
        double valorGasolina = scanner.nextDouble();

        System.out.print("Quantos litros você vai abastecer? ");
        double litrosGasolina = scanner.nextDouble();

        double valorPagar = litrosGasolina * valorGasolina;

        System.out.println(" O cliente devera pagar: R$" + valorPagar);

    }

}
