import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em fahrenheit:");

        float c = sc.nextFloat();
        //   (c * 9/5) + 32

        System.out.printf("Graus fahrenheit é %.2f ", (c * 9/5) + 32);
    }
}