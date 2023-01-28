package aula02;

import java.util.Scanner;

public class ExerciseSixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o sexo - m(masculino), f(feminino): ");
        var sexo = sc.next();

        if ("m".equalsIgnoreCase(sexo)) {
            System.out.println("Sexo masculino! ");
        } else if ("f".equalsIgnoreCase(sexo)) {
            System.out.println("sexo feminino! ");
        } else {
            System.out.println("sexo inválido! ");
        }
    }
}