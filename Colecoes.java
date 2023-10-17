import java.util.Scanner;
import java.util.Arrays;

/**
 * Colecoes
 */
public class Colecoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("lista de nomes separados por virgula:");

        String[] nomes = scanner.nextLine().split(",");

        Arrays.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }

}