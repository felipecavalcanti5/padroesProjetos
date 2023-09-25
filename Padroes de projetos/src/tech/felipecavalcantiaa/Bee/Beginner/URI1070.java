package tech.felipecavalcantiaa.Bee.Beginner;

import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) {
        int x;

        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();

        for(int i=x; i<=x+11; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
