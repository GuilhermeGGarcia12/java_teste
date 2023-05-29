
import java.util.Scanner;

public class CalculoMedia {
public static void main(String[] args) {
float n1, n2, n3, n4, media;

    Scanner nota = new Scanner(System.in);
    
        System.out.print("Entre com a primeira nota: ");
        n1 = nota.nextFloat();

        System.out.print("Entre com a segunda nota: ");
        n2 = nota.nextFloat();

        System.out.print("Entre com a terceira nota: ");
        n3 = nota.nextFloat();

        System.out.print("Entre com a quarta nota: ");
        n4 = nota.nextFloat();

        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média das notas é: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
            } else {
                System.out.println(" Aluno reprovado!");
            }
        }
}
