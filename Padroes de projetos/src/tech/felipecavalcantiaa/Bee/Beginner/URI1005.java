package tech.felipecavalcantiaa.Bee.Beginner;

import java.util.Scanner;

public class URI1005 {
    public static void main(String[] args) {
        double A, B, media;

        Scanner scan = new Scanner(System.in);

        A = scan.nextDouble();
        B = scan.nextDouble();


        media = ((A*3.5)+(B*7.5))/11;
        System.out.println(String.format("MEDIA = %.5f", media));
    }
}
