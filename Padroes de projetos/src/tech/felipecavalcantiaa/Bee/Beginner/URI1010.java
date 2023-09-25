package tech.felipecavalcantiaa.Bee.Beginner;

import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        int codigoUnidades1, numUnidades1, codigoUnidades2, numUnidades2;
        double precoPorUnidade1, precoPorUnidade2 ;

        Scanner scan = new Scanner(System.in);
        codigoUnidades1 = scan.nextInt();
        numUnidades1 = scan.nextInt();
        precoPorUnidade1 = scan.nextDouble();

        codigoUnidades2 = scan.nextInt();
        numUnidades2 = scan.nextInt();
        precoPorUnidade2 = scan.nextDouble();

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", (numUnidades1*precoPorUnidade1)+(numUnidades2*precoPorUnidade2)));
    }
}
