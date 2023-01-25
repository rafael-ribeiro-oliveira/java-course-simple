package aula02;

import java.util.Scanner;

public class ExercoseOne {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        var num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        var num2 = sc.nextInt();

        if (num1 > num2) {
        } else {
            System.out.println("o maior numero é: " + num2);
        }
         if (num2 > num1) {

            }else{
             System.out.println("o maior número é: " + num1);
        }
    }
}
