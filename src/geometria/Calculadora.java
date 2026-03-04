package geometria;

import java.util.Scanner;

public class Calculadora {

    private double lado;
    private double base;
    private double altura;
    private double raio;
    private int opcao;

    Scanner s = new Scanner(System.in);

    public void menu() {

        System.out.println("1 - Calcular Área do Quadrado");
        System.out.println("2 - Calcular Área do Retângulo");
        System.out.println("3 - Calcular Área do Círculo");
        System.out.println("4 - Sair");

    }

    public void executar() {

        System.out.print("Escolha uma opção: ");
        opcao = s.nextInt();

        switch (opcao) {

            case 1:

                System.out.print("Digite o lado do quadrado: ");
                lado = s.nextDouble();

                double areaQ = lado * lado;

                System.out.printf("Área do quadrado: %.2f\n", areaQ);

                break;


            case 2:

                System.out.print("Digite a base do retângulo: ");
                base = s.nextDouble();

                System.out.print("Digite a altura do retângulo: ");
                altura = s.nextDouble();

                double areaR = base * altura;

                System.out.printf("Área do retangulo: %.2f\n", areaR);

                break;


            case 3:

                System.out.print("Digite o raio do círculo: ");
                raio = s.nextDouble();

                double areaC = 3.14 * (raio * raio);

                System.out.printf("Área do círculo:  %.2f\n", areaC);

                break;


            case 4:

                System.out.println("Saindo");

                break;


            default:

                System.out.println("Opção inválida");

        }

    }
	
}