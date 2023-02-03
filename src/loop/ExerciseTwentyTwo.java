package loop;

import java.util.Scanner;

public class ExerciseTwentyTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Boolean infovalidas = false;
        String nomeUser;
        String senhaUser;

        do {
            System.out.println("Entre com o nome de Usuário: ");
            nomeUser = scan.next();

            System.out.println("Entre com a senha: ");
            senhaUser = scan.next();

            if(nomeUser.equalsIgnoreCase(senhaUser)){
                //infoInvalida = false;
                System.out.println("Senha igual a usúario, digite novamente.");
            }else{
                infovalidas = true;
                System.out.println("Senha e usuários válidos. ");
            }
        } while (!infovalidas);
    }
}