package tech.felipecavalcantiaa.Bee;

import java.util.Scanner;

public class URI1007 {
    public static void main(String[] args) {
        int A, B, C, D;

        Scanner scan = new Scanner(System.in);
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();

        int DIFERENCA = (A*B)-(C*D);

        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
