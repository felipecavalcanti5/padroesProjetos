package tech.felipecavalcantiaa.Bee.Beginner;
import java.util.Scanner;

public class URI1065 {
    public static void main(String[] args) {
        double num;
        int pares = 0;

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<= 4; i++){
            num = scan.nextDouble();
            if(num % 2 == 0){
                pares += 1;
            }
        }
        System.out.println(pares + " valores pares");
    }
}
