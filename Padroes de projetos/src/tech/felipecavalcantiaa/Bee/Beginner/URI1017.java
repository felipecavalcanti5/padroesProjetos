package tech.felipecavalcantiaa.Bee.Beginner;

import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) {
        double speedPerLiter = 12;
        int time;
        int avarageSpeed;

        Scanner scan = new Scanner(System.in);
        time = scan.nextInt();
        avarageSpeed = scan.nextInt();

        double distance = time * avarageSpeed;
        double liters = distance / speedPerLiter;

        System.out.println(String.format("%.3f", liters));

    }
}
