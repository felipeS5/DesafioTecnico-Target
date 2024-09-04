package org.fsm;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String string = scanner.nextLine().toLowerCase();
        String[] strings = string.split("");

        int count = 0;
        for (String s : strings) {
            if (s.equals("a")) count++;
        }

        if (count == 0) {
            System.out.printf("A string \"%s\" não possui letra \"a\"", string);
        } else {
            System.out.printf("A string \"%s\" possui %d letra(s) \"a\"", string, count);
        }


        scanner.close();
    }
}
