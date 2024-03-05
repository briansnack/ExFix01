package ExFix01;

import java.util.Scanner;

class ExFix01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Número matrícula do aluno: ");
        int matricula = leitor.nextInt();

        System.out.println("Nome do aluno: ");
        String nome = leitor.nextLine();

        System.out.println("Nota 1: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Nota 2:");
        double nota2 = leitor.nextDouble();

        double notaFinal = (nota1 + nota2) / 2;

        System.out.println("Matrícula do aluno: " + matricula);
        System.out.println("Nome do aluno: " + nome);
        if (notaFinal >= 6) {
            System.out.println("Aprovado");
        } else{
            System.out.println("Reprovado");
        }
        System.out.println("Nota final: " + notaFinal);
        leitor.close();
    }
}
