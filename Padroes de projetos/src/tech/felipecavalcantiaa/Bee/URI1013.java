package tech.felipecavalcantiaa.Bee;

import java.util.Scanner;

public class URI1013 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        int MaiorAB = ((a+b)+(a-b))/2;
        System.out.println(MaiorAB + " eh o maior");
    }
}
