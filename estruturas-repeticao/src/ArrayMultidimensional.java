import java.util.Random;

/* Programa gera e imprime uma matriz de ordem 4
 * Inserir valores aleatórios entre 0 e 9
 */

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random number = new Random();

        int[][] arrayMult = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                arrayMult[i][j] = number.nextInt(9);
            }
        }

        System.out.println("Matriz:");
        for (int[] row : arrayMult) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }
}
