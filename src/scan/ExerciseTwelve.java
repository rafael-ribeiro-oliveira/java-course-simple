package scan;

import java.util.Scanner;

//    tendo como dados de entrada a altura e o sexo de uma pessoa,
//    construa um algoritmo que calcule seu peso ideal utilizando os seguintes formulas:
//    para homens (72.7*h)-58 para mulheres (62.1*h)-44.7


public class ExerciseTwelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura: ");
        var h = sc.nextDouble();
        System.out.println("Digite o sexo: ");
        var sexo = sc.next();


        double pesoIdeal;
        if (sexo.equalsIgnoreCase("m")) {
            pesoIdeal = (72.7 * h) - 58;
        } else { pesoIdeal =  (62.1 * h) - 44.7;

        }

        System.out.printf("O peso ideal é: %.2f \n", pesoIdeal);

        System.out.println("Digite o seu peso: ");
        var pesoAtual = sc.nextInt();
        if (pesoIdeal == pesoAtual) {
            System.out.println("peso ideal ");
        } else if (pesoAtual < pesoIdeal) {
            System.out.println("está abaixo do peso ");
        } else {
            System.out.println("está acima do peso ");

        }
    }
}
