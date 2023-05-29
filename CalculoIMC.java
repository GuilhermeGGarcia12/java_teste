import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu peso em kg: ");
        double peso = input.nextDouble();

        System.out.println("Digite a sua altura em metros: ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu imc é: " + imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Seu peso esta normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Você está com sobrepeso de primeiro grau");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Você está com sobrepeso de segundo grau");
        } else {
            System.out.println("Você está com obesidade mórbida ");
        }
    }
}
