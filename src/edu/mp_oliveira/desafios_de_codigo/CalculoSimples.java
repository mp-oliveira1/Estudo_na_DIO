package edu.mp_oliveira.desafios_de_codigo;
import java.util.Scanner;
public class CalculoSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int cod1 = leitor.nextInt();
        int n1 = leitor.nextInt();
        double valor1 = leitor.nextDouble();
        int cod2 = leitor.nextInt();
        int n2 = leitor.nextInt();
        double valor2 = leitor.nextDouble();


// TODO: Implemente um Cálculo Simples.
// Levando em consideração a sua precedência de operadores e a definição de suas casas decimais:

        double total = valor1 * n1 + valor2 * n2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n \n", total);
    }

}
