import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora de trabalho: ");

        float valorHora = scan.nextFloat();

        System.out.println("Digite quantas horas voce trabalha por dia: ");

        int horasTrab = scan.nextInt();

        int quantDiasTrab = 22;

        System.out.printf("O seu salario, em um mes, eh de: %.2f", (valorHora * horasTrab) *
                quantDiasTrab);
    }
}
