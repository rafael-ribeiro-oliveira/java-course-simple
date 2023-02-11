package loop;

import java.util.Scanner;

    //Faça um programa que receba dois números inteiros e gere os números inteiros
    // e que gere os números inteiros que estão no intervalo compreendido por eles.
public class ExerciseThirty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int i;

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scan.nextInt();

        for (i = num1; i <= num2; i++) {
            System.out.println(i);
        }

    }
}
