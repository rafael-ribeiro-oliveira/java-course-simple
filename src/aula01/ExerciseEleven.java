package aula01;

import java.util.Scanner;

//Faça um programa que peça 2 números inteiros e um numero real calcule e mostre:
//        a) o produto do dobro do primeiro com metade do segundo
//        b) a soma do triplo do primeiro com o terceiro
//        c) o terceiro elevado ao cubo
public class ExerciseEleven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");

        int n1 = scan.nextInt();

        System.out.println("Digite o segundo número ");

        int n2 = scan.nextInt();

        System.out.println("Número real: ");

        int n3 = scan.nextInt();

        System.out.printf("\n\n Soma: %d ", 2 * n1 + n2);
        System.out.printf("\n Produto: %d", (3 * n1) + n3);
        System.out.printf("\n Cubo: %d\n", pow(n3, 3));
    }

    public static int pow(int n, int e) {
        int r = 1;

        for(int i = 0; i < e; i++ ){
            r *= n;
        }
        return r;
    }
}
