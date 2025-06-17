
package es4;

import java.util.Scanner;

public class es4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero : ");
        int numero = scanner.nextInt();

        System.out.println("Countdown:");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
