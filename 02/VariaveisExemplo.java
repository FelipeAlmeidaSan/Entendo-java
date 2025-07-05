
public class VariaveisExemplo {
    public static void main(String[] args) {
        int idade = 28;
        double altura = 1.75;
        char genero = 'M';
        boolean estudante = true;
        String nome = "Felipe";

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Gênero: " + genero);
        System.out.println("É estudante? " + estudante);
    }
}

// int      Número inteiro
// double   Número decimais
// char     Um único caractere
// boolean  True or False (Verdadeiro ou falso)
// string   Texto


import java.util.Scanner; // ✅ Import deve estar fora da classe

public class VariaveisExemplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // ✅ Cria o scanner

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = input.nextInt(); // ✅ Lê o ano digitado

        int idade = 2025 - anoNascimento; // ✅ Calcula a idade

        System.out.println("Você tem " + idade + " anos."); // ✅ Exibe o resultado
    }
}


/*🧪 Exercício 1: Calculadora de Idade
Descrição:
Crie um programa que pergunte ao usuário o ano de nascimento e calcule sua idade com base no ano atual (assuma que o ano atual é 2025).

Entrada:

Um número inteiro representando o ano de nascimento.

Saída:

Um número inteiro representando a idade da pessoa. */