package org.fsm;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int n= scanner.nextInt();

        boolean isFibo = calcularFibo(n);

        if (isFibo) {
            System.out.printf("O número %d, faz parte da sequência de fibonacci", n);
        } else {
            System.out.printf("Não, o número %d, não faz parte da sequência de fibonacci", n);
        }


        scanner.close();
    }

    static boolean calcularFibo(int n) {
        int fibo = 0;
        int n1 = 0;
        int n2 = 1;
        while (fibo <= n) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            fibo = n3;

            if (fibo == n) return true;
        }

        return false;
    }
}
