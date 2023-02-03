package scan;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os numeros: ");

        float bim1 = sc.nextFloat();
        float bim2 = sc.nextFloat();
        float bim3 = sc.nextFloat();
        float bim4 = sc.nextFloat();

        System.out.printf("A média do Bimestre é %.1f", (bim1 + bim2 + bim3 + bim4) / 4 );
    }
}
