package loop;

import java.util.Scanner;

public class ExerciseTwentyEight {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        int num;
        int media;
        int soma = 0;

        for (int i = 0; i < 5; i++ ) {
            System.out.println("Digite um número");
            num = cs.nextInt();

            soma += num;
        }
        media = soma / 5;

        System.out.println("Soma " + soma);
        System.out.println("Média " + media);
    }
}
