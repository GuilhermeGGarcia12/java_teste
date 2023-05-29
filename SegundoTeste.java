import java.util.Scanner;

public class SegundoTeste {

	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in); // entrada pelo teclado
	
		String nome;
		int idade;
	
		System.out.println("Meu segundo programa em Java! Uhhuu!"); // println já com quebra de linha
	
		System.out.println("Entre com seu nome:");
		nome = texto.nextLine();
		System.out.println("Bem vindo(a), " + nome);
	
		System.out.println("Entre com sua idade:");
		idade = texto.nextInt();
		System.out.println("A idade digitada foi: " + idade);
	}
}
Guilh