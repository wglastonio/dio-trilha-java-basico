import java.util.Scanner;

/* Programa para ler conjuntos de dois valores
 * O primeiro valor é o nome e o segundo valor é a idade
 * Parar o programa inserindo 0 (zero) no campo nome
 */


public class NomeIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int idade = 0;

        while(true) {
            System.out.println("Nome: ");
            nome = input.next();
            
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = input.nextInt();
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        input.close();
    }
}
