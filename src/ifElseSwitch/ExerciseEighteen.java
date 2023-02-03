package ifElseSwitch;

import java.util.Scanner;
//Faça um programa para a leitura de duas notas parciais de um aluno.
// O programa deve calcular a média alcançada pelo aluno e apresentar:
//1)A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//2)A mensagem "Reprovado", se a média for menor do que sete;
//3)A mensagem "Aprovado com Distinção", se a média for igual a dez.

public class ExerciseEighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        var nota1 = sc.nextFloat();

        System.out.println("Segunda nota: ");
        var nota2 = sc.nextFloat();

        float media = (nota1 + nota2) / 2;
        if (media >= 7 && media <10){
            System.out.printf("APROVADO %.2f", media);
        } else if (media <7 && media >= 0) {
            System.out.printf("REPROVADO %.2f", media);
        } else if (media == 10) {
            System.out.printf("APROVADO COM DISTINÇÃO %.2f", media);
        }
    }
}
