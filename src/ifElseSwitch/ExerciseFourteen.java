package ifElseSwitch;

import java.util.Scanner;

public class ExerciseFourteen {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        var num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        var num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("o maior numero é: " + num1);
        } else
             System.out.println("o maior número é: " + num2);
    }
}
