package loop;

public class Exemp {

    public static void main(String[] args) {
        var isValid = isDocumentNotValid("asdg");

        if (isValid) {
            System.out.println("ERROR!");
        }
        System.out.println("Minha solução");
    }

    public static boolean isDocumentNotValid(String document) {
        //se for igual a 4 true se não, false. length == Tamanho
        return document.length() != 4;
    }


}
