import java.util.Scanner;

/* Programa que calcula o fatorial de um número inteiro fornecido pelo usuário */

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = -1;
        int fat = 1;
        
        do {
            System.out.print("Entre o número: ");
            num = input.nextInt();
            
            if (num < 0) {
                System.out.println("Valor inválido! ");
            }
        } while (num < 0);

        if (num > 1) {
            for (int i = num; i > 1; i--) {
                fat = fat * i;
            }
        }

        System.out.println("Fatorial = " + fat + "\n");
        input.close();
    }
}
