import java.util.Scanner;

/* Programa solicita n números inteiros
 * Calcula e mostra a quantidade de números pares e números ímpares
 */

public class ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você deseja entrar: ");
        int count = input.nextInt();

        int num;
        int pares = 0;
        int impares = 0 ;

        for (int i = 0; i < count; i++) {
            System.out.print("Entre o número: ");
            num = input.nextInt();

            if ((num % 2) == 0){
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares:\t" + pares);
        System.out.println("Quantidade de números ímpares:\t" + impares);

        input.close();
    }
}
