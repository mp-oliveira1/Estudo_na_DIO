package edu.mp_oliveira.aprendendo_sintaxe_java_DIO.logicaCondicionalEControleDeFluxo;

import java.util.Scanner;

//são estruturas que direcionam código de acordo com as condições impostas
public class ControleDeFluxo {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ditite um número de 1 a 12.");
        int mes;
        mes = scanner.nextInt();

        if (mes == 1){
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        }else System.out.println("Mês inesistente");

        String semana;
        System.out.println("Digite o dia da semana.");
        semana = scanner.next();
        int semana2 = 0;
        String mensagemdeerro = "";
        switch (semana) {
            case "segunda": semana2 = 1;
                    break;
            case "terca": semana2 = 2;
                    break;
            case "quarta": semana2 = 3;
                    break;
            case "quinta": semana2 = 4;
                    break;
            case "sexta": semana2 = 5;
                    break;
            case "sabado": semana2 = 6;
                    break;
            case "domingo": semana2 = 7;
            break;
            default: semana2 = 0;
                    break;
            }
            if (semana2 != 0) {
                System.out.println((semana) + " É o " + (semana2) + "º dia da semana.");
            }else System.out.println("Dia da semana inválido");


        int numero;
        System.out.println("Digite um número de 1 a 5.");
        numero = scanner.nextInt();
        String resposta = "";
        switch (numero){
        case 1,2,3: resposta = "Certo";
        break;
        case 4: resposta = "Errado";
        break;
        case 5: resposta = "Talvez";
        break;
        default: resposta = "Valor indefinido";
        break;
        }
        System.out.print(resposta);

    }
}
