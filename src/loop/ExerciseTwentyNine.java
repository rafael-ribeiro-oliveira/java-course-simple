package loop;

import java.util.Scanner;

    // Mostre apenas os números impares
public class ExerciseTwentyNine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i;
        for (i = 0; i < 50; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
