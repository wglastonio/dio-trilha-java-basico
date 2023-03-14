import java.util.Scanner;

/* Programa que pede uma nota entre 0 e 10
 * Mostra uma mensagem caso o valor seja inválido
 * Continua pedindo uma nota até o usuário informar um valor válido
 */

public class Nota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;

        do {
            System.out.println("Entre com uma nota entre 0 e 10: ");
            nota = input.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido!! \n");
            }

        } while (nota < 0 || nota > 10);

        input.close();
    }
}
