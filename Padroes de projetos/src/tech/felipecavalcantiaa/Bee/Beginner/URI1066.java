package tech.felipecavalcantiaa.Bee.Beginner;
import java.util.Scanner;

public class URI1066 {
    public static void main(String[] args) {
        double num;
        int par = 0;
        int impar = 0;
        int postivo = 0;
        int negativo = 0;

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<= 4; i++){
            num = scan.nextDouble();
            if(num % 2 == 0){
                par += 1;
            }else if(num % 2 != 0){
                impar += 1;
            }if(num > 0){
                postivo += 1;
            }else if(num < 0){
                negativo += 1;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(postivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}
