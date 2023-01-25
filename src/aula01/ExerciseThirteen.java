package aula01;

import java.util.Random;
import java.util.Scanner;

public class ExerciseThirteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de quilos que você pegou: ");
        float peso = scan.nextFloat();

        //  float totalPagar = peso > 50 ? (peso - 50) * 4 : 0;
        // (If ternário)

        if (peso > 50) {
            System.out.printf("valor total a pagar: %.2f\n", (peso - 50) * 4);
        } else {
            System.out.println("valor total a pagar: 0,00");
        }

     //   System.out.printf("valor total a pagar: %.2f", totalPagar);

    }
}