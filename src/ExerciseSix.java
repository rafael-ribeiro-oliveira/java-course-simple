import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float raio = sc.nextFloat();

        System.out.printf("O círculo com %.2f de diametro, o raio será igual a %.2f centimetros",
                raio, raio / 2 );


    }
}
