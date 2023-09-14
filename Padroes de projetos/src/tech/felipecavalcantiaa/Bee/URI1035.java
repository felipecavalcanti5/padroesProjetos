package tech.felipecavalcantiaa.Bee;

import java.util.Scanner;

public class URI1035 {
    public static void main(String[] args) {
        int A, B, C, D;
        Scanner scan = new Scanner(System.in);

        //System.out.println("Digite A: ");
        A = scan.nextInt();
        //System.out.println("Digite B: ");
        B = scan.nextInt();
        //System.out.println("Digite C: ");
        C = scan.nextInt();
        //System.out.println("Digite D: ");
        D = scan.nextInt();

        if(B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}
