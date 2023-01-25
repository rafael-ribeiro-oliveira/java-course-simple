package aula01;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o lado do quadrado: ");
        float lado = sc.nextFloat();

        System.out.printf("\n A área do quadrado é %.2f", lado * lado);
        System.out.printf("\n O dobro dessa área é %.2f", lado * lado * 2);

    }
}
