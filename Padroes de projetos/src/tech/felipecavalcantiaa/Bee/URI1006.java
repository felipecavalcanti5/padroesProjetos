package tech.felipecavalcantiaa.Bee;

import java.util.Scanner;

public class URI1006 {

    public static void main(String[] args) {

        /*Read three values (variables A, B and C), which are the three student's grades.
         Then, calculate the average, considering that grade A has weight 2,
          grade B has weight 3 and the grade C has weight 5.
          Consider that each grade can go from 0 to 10.0, always with one decimal place.*/

    double A;
    double B;
    double C;

    double media;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a nota A: ");
        A = scan.nextDouble()*2;
        System.out.println("Qual a nota B: ");
        B = scan.nextDouble()*3;
        System.out.println("Qual a nota C: ");
        C = scan.nextDouble()*5;

        media = (A+B+C)/10;
        System.out.println(String.format("media = %.1f", media));





/**
 * Escreva a sua solução aqui
 * Code your solution here
 * Escriba su solución aquí
 */

    }
}
