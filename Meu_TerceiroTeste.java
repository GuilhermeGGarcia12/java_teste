import java.util.Scanner;

public class Meu_TerceiroTeste {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in); // entrada pelo teclado

        String nome;
        int idade;
        String funcao;
        String formacao;
    
        System.out.println("Meu segundo programa em Java! Uhhuu!"); // println já com quebra de linha
    
        System.out.println("Entre com seu nome:");
        nome = texto.nextLine();
        System.out.println("Bem-vindo(a), " + nome);
    
        System.out.println("Entre com sua idade:");
        idade = texto.nextInt(); // tipo int precisa vir como nextInt
        System.out.println("A idade digitada foi: " + idade);
    
        texto.nextLine(); // Consumir a nova linha pendente após nextInt()
    
        System.out.println("Entre com sua função no grupo de Demoday:");
        funcao = texto.nextLine();
        System.out.println("A sua função é: " + funcao);
    
        System.out.println("Entre com sua formação:");
        formacao = texto.nextLine();
        System.out.println("Você é formado(a) em: " + formacao);
    
        }

    }
