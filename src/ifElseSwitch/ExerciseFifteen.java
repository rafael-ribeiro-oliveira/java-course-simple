package ifElseSwitch;

import java.util.Scanner;

public class ExerciseFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        var num = sc.nextInt();

        if (num > 0) {
            System.out.println("\n O valor digitado é positivo: " );
        } else if (num < 0) {
            System.out.println("\n O valor digitado é negativo: ");
        } else {
            System.out.println("\n O NÚMERO É ZERO  ");
        }
    }
}
