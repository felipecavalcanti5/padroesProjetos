package tech.felipecavalcantiaa.Bee;

import java.util.Scanner;

public class URI1002 {
    public static void main(String[] args) {
        double R;
        double n = 3.14159;

        Scanner scan = new Scanner(System.in);
        R = scan.nextDouble();
        double A = n*R*R;

        System.out.println(String.format("A=%.4f", A));
    }
}
