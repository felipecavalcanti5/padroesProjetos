package tech.felipecavalcantiaa.Bee.Beginner;
import java.util.Scanner;
public class URI1011 {
    public static void main(String[] args) {
        double pi = 3.14159;
        double r;

        Scanner scan = new Scanner(System.in);
        r = scan.nextDouble();

        double volume = (4/3.0)* pi * Math.pow(r, 3);

        System.out.println(String.format("VOLUME = %.3f", volume));

    }
}
