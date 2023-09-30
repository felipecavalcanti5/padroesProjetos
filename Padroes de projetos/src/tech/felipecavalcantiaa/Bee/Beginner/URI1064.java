package tech.felipecavalcantiaa.Bee.Beginner;

import java.util.Scanner;

public class URI1064 {
    public static void main(String[] args) {
        double num;
        int positivo = 0;
        double soma = 0;
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<= 5; i++){
            num = scan.nextDouble();
            if(num > 0){
                positivo += 1;
                soma += num;
            }
        }
        System.out.println(positivo + " valores positivos");
        System.out.println(String.format("%.1f", soma/positivo));
    }
}
