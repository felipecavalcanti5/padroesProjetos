package tech.felipecavalcantiaa.Bee.Beginner;
import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        int id, horasTrabalhadas;
        double salarioHora;

        Scanner scan = new Scanner(System.in);
        id = scan.nextInt();
        horasTrabalhadas = scan.nextInt();
        salarioHora = scan.nextDouble();

        System.out.println("NUMBER = " + id);
        System.out.println(String.format("SALARY = U$ %.2f", horasTrabalhadas * salarioHora));

    }
}
