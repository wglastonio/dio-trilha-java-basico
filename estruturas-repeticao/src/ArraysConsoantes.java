import java.util.Scanner;

/* Programa para ler um vertor de 6 caracteres
 * Informa quantas consoantes foram lidas
 * Imprime as consoantes
 */

public class ArraysConsoantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] letters = new String[6];
        int consonants = 0;

        int count = 0;
        do {
            System.out.print("Entre a letra: ");
            String i = input.next();

            if (!(i.equalsIgnoreCase("a") ||
                  i.equalsIgnoreCase("e") ||
                  i.equalsIgnoreCase("i") ||
                  i.equalsIgnoreCase("o") ||
                  i.equalsIgnoreCase("u"))) {

                    letters[count] = i;
                    consonants++;
                };
            count++;
        } while (count < letters.length);

        System.out.print("Total de consoantes: " + consonants);

        System.out.print("\nResultado: { ");

        for (String i : letters) {
            if (i != null){
                System.out.print(i + " ");
            }
        }

        System.out.println("}");

        input.close();
    }
}
