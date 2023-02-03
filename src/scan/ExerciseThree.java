package scan;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os números: ");

        int num = scan.nextInt();

        int num1 = scan.nextInt();

        System.out.println("Resultado: " + (num + num1));

    }
}
