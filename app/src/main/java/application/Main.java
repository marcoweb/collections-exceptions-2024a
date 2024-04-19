package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        for(int cont = 0; cont < numeros.length; cont++) {
            try {
                System.out.println("Digite um Número Inteiro:");
                Scanner sc = new Scanner(System.in);
                numeros[cont] = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Tipo de Dado Inválido");
                cont--;
            }
        }

        System.out.print("Valores Válidos: ");
        for(int val : numeros) {
            System.out.print(val + " ");
        }
    }
}

