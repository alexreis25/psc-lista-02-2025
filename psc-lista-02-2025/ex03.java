import java.util.Scanner;
public class ex03{
    public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Nota primero bimestre: ");
    double bimestre1 = scanner.nextDouble();

    System.out.print("Nota do segundo bimestre: ");
    double bimestre2 = scanner.nextDouble();

    System.out.print(" Nota terceiro bimestre: ");
    double bimestre3 = scanner.nextDouble();

    System.out.print(" Nota quarto bimestre: ");
    double bimestre4 = scanner.nextDouble();

    double media = (bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4;

    System.out.println("A medida dos 4 bimestres é: " + media);

    scanner.close();    
    }
}

