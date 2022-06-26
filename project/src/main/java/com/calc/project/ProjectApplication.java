package com.calc.project;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		Calculate c = new Calculate();

		int opc = 8;
		int num1 = 10;
		int num2 = 20;

		Scanner input = new Scanner(System.in);

		System.out.println("ESCOLHA UMA OPÇÃO: ");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("5 - Módulo");
		System.out.println("6 - Exponenciação");
		System.out.println("7 - Raiz Quadrada");
		System.out.println("0 - Sair");

		opc = input.nextInt();

		while (opc != 0) {
			Scanner input2 = new Scanner(System.in);

			System.out.println("Qual o primeiro número?");
			num1 = input2.nextInt();
			System.out.println("Qual o segundo número?");
			num2 = input2.nextInt();

			if (opc == 1) {
				System.out.println("O resultado da adição é: " + c.add(num1, num2));
				break;
			} else if (opc == 2) {
				System.out.println("O resultado da subtração é: " + c.sub(num1, num2));
				break;
			} else if (opc == 3) {
				System.out.println("O resultado da multiplicação é: " + c.mul(num1, num2));
				break;
			} else if (opc == 4) {
				System.out.println("O resultado da divisão é: " + c.div(num1, num2));
				break;
			} else if (opc == 5) {
				System.out.println("O resultado do módulo é: " + c.mod(num1, num2));
				break;
			} else if (opc == 6) {
				System.out.println("O resultado da exponenciação é: " + c.exponent(num1, num2));
				break;
			} else if (opc == 7) {
				System.out.println("O resultado da raiz quadrada é: " + c.sqrt(num1));
				break;
			} else {
				System.out.println("Opção inválida!");
				break;
			}
		}
	}

}
