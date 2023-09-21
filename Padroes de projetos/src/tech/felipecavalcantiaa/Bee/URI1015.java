package tech.felipecavalcantiaa.Bee;

import java.util.Scanner;
public class URI1015 {
    public static void main(String[] args) {
        double x1,y1;
        double x2,y2;

        Scanner scan = new Scanner(System.in);
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        double Distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println(String.format("%.4f",Distance));

    }
}
