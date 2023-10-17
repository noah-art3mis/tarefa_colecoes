import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Colecoes
 * e.g. Luana - M, Rodrigo - F, Martin - M
 */
public class Sexo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> m = new ArrayList<String>();
        List<String> f = new ArrayList<String>();

        System.out.println("lista de nomes e sexos separados por virgula (e.g. 'Luana - M,Rodrigo - F,etc'):");

        String[] pessoas = scanner.nextLine().split(",");

        Arrays.sort(pessoas);

        for (String pessoa : pessoas) {
            String[] item = pessoa.split("-");

            if (item[1].trim().equalsIgnoreCase("m")) {
                m.add(item[0]);
            } else {
                f.add(item[0]);
            }
        }

        System.out.println("M:");
        for (String nome : m) {
            System.out.println("\t" + nome.trim());
        }

        System.out.println("F:");
        for (String nome : f) {
            System.out.println("\t" + nome.trim());
        }

        scanner.close();
    }

}