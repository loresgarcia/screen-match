package desafios;

import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.print("Escolha uma opção (1 ou 2): ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Digite o valor do lado do quadrado: ");
            double lado = sc.nextDouble();
            double areaQuadrado = lado * lado;
            System.out.println("A área do quadrado é " + areaQuadrado);
        } else if (opcao == 2) {
            System.out.print("Digite o valor do raio do círculo: ");
            double raio = sc.nextDouble();
            double areaCirculo = Math.PI * Math.pow(raio, 2);
            System.out.printf("A área do círculo é %.2f\n", areaCirculo);
        } else {
            System.out.println("Opção inválida");
        }

        sc.close();
    }
}
