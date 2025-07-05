

import java.util.Scanner; // ✅ Import deve estar fora da classe

public class CalculoIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // ✅ Cria o scanner

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = input.nextInt(); // ✅ Lê o ano digitado

        int idade = 2025 - anoNascimento; // ✅ Calcula a idade

        System.out.println("Você tem " + idade + " anos."); // ✅ Exibe o resultado
    }
}
