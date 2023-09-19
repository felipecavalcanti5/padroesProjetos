package tech.felipecavalcantiaa.Bee;

import java.util.Scanner;

public class URI1067 {
    public static void main(String[] args) {
        int X;
        //int i = 1;
        Scanner scan = new Scanner(System.in);
        X = scan.nextInt();
        for(int i=1 ; i<= X; i++ ){
            if(i % 2!=0){
                System.out.println(i);
            }
        }

        /*while(i <= X){
            if (i % 2 != 0){
                System.out.println(i);
                i++;*/

            //}

        //}
    }
}
