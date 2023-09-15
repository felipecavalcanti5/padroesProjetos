package tech.felipecavalcantiaa.Bee;

import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) {
        String nome;
        double salarioFixo, vendaTotal;

        Scanner scan = new Scanner(System.in);
        nome = scan.next();
        salarioFixo = scan.nextDouble();
        vendaTotal = scan.nextDouble();

        System.out.println(String.format("TOTAL = R$ %.2f", ((salarioFixo)+(vendaTotal * 0.15))));
    }
}
