import java.util.Scanner;

/* Programa para ler 5 números
 * Informa o maior valor
 * Informa a média dos números
 */

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double maior = 0d;
        double media = 0d;
        String ordem = "";

        for (int i = 0; i < 5; i++) {

            switch (i) {
                case 0:
                    ordem = "primeiro";
                    break;
                case 1:
                    ordem = "segundo";
                    break;
                case 2:
                    ordem = "terceiro";
                    break;
                case 3:
                    ordem = "quarto";
                    break;
                default:
                    ordem = "quinto";
            }

            System.out.print("Entre com o " + ordem + " número:\t");
            double num = input.nextDouble();
            media = (num / 5.0) + media;

            if (i == 0) {
                maior = num;
            }
            if (num > maior) {
                maior = num;
            }
        }
        
        System.out.println("\nNúmero maior: " + maior);
        System.out.println("Média dos números: " + media + "\n");

        input.close();
    }
}
