package loop;

import java.util.Scanner;

public class ExerciseTwentyOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Boolean notaValida = false;
        do {
            System.out.println("Digite uma nota: ");

            double nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.println("Você digitou " + nota);
            }else{
                // notaInvalida = false;
                System.out.println("Nota invalida digite novamente.");
            }
        } while (!notaValida);

    }
}
