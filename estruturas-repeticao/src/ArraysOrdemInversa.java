/* Cria um vetor de 6 números inteiros
 * Mostra os números em ordem inversa
 */

public class ArraysOrdemInversa {
    public static void main(String[] args) {
        int[] ordemInversa = {-5, -6, 15, 50, 8, 4};

        System.out.print("Vetor invertido: { ");
        for (int i = (ordemInversa.length - 1); i >= 0; i--) {
            System.out.print(ordemInversa[i] + " ");
        }
        System.out.print("}");
    }
}
