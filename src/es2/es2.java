package es2;

import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero tra 0 e 3 per vederlo stampato in lettere:");
        int numero= Integer.parseInt(scanner.nextLine());

        switch(numero){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("numero non richiesto");
        }

    }
}
