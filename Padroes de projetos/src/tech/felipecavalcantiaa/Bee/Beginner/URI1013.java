package tech.felipecavalcantiaa.Bee.Beginner;
import java.util.Scanner;

public class URI1013 {
    public static void main(String[] args) {
        
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " eh o maior");
        }else if(b > a && b > c){
            System.out.println(b + " eh o maior");
        }else if(c > a && c > b){
            System.out.println(c + " eh o maior");
        }
    }
}
