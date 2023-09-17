package tech.felipecavalcantiaa.Bee;

import java.util.Scanner;

public class URI1014 {
    public static void main(String[] args) {
        int X;
        double Y;

        Scanner scan = new Scanner(System.in);
        X = scan.nextInt();
        Y = scan.nextDouble();

        System.out.print(String.format("%.3f", X/Y));
        System.out.println(" km/l");
    }

}
