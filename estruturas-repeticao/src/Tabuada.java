import java.util.Scanner;

/* Programa gerador de tabuada
 * O usuário entra com o número que deseja ver a tabuada
 */

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre o valor da tabuada: ");
        int num = input.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        input.close();
    }
}
