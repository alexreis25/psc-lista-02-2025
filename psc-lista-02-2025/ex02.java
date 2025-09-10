import java.util.Scanner;
public class ex02 {
    public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);
    
        System.out.print(" Digite um número: ");
        int numero1 = scanner.nextInt();

        System.out.print(" Digite um segundo número: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        System.out.println(" A soma dos dois números é : " + soma);

        int subtracao = numero1 - numero2;
        System.out.println(" A subtração do primero pelo segundo número é: " + subtracao);

        int multiplicacao = numero1 * numero2;
        System.out.println(" A multiplicação dos dois número é: " + multiplicacao);

         scanner.close();

    }
    
}

