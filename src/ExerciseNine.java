import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em fahrenheit: ");

        float f = sc.nextFloat();
        // C = (5 * (f - 32) / 9)

        System.out.printf("Graus Celcius é %.2f", 5 * (f - 32) / 9);


    }
}
