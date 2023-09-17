package tech.felipecavalcantiaa.Bee;

import java.sql.SQLOutput;
import java.util.Scanner;

public class URI1012 {
    public static void main(String[] args) {
        double A, B, C;
        double pi = 3.14159;

        Scanner scan = new Scanner(System.in);
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();

        System.out.println(String.format("TRIANGULO: %.3f", (C*A)/2));
        System.out.println(String.format("CIRCULO: %.3f", pi* Math.pow(C, 2)));
        System.out.println(String.format("TRAPEZIO: %.3f",(A+B)/2*C));
        System.out.println(String.format("QUADRADO: %.3f", Math.pow(B, 2)));
        System.out.println(String.format("RETANGULO: %.3f", A*B));
    }
}
