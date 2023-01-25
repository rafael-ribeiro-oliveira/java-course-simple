package aula01;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float compMetro = scan.nextFloat();

        System.out.printf("%.2f metros é igual a %.2f centímetros", compMetro, compMetro * 100);


    }
}
