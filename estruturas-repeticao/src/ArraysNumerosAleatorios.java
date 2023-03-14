import java.util.Random;

/* Programa para ler 20 números inteiros aleatórios entre 0 e 100
 * Armazenar os números em um vetor
 * Mostra os números e seus sucessores
 */

public class ArraysNumerosAleatorios {
    public static void main(String[] args) {
        Random randomNum = new Random();

        int[] numbersList = new int[20];

        for (int i = 0; i < numbersList.length; i++) {
            int number = randomNum.nextInt(100);
            numbersList[i] = number;
            System.out.println("Par gerado: { " + number + " " + (number + 1) + " }");
        };

        System.out.print("\nLista gerada: { ");
        for (int i : numbersList) {
            System.out.print(i + " ");
        }
        System.out.print("}");

        System.out.print("\nSucessores  : { ");
        for (int i : numbersList) {
            System.out.print((i + 1) + " ");
        }
        System.out.println("}\n");
    }
}
