package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj godzine (0-23): ");
        int godzina = scanner.nextInt();

        try {
            if (godzina < 0 || godzina > 23) {
                throw new IllegalArgumentException("Podana godzina nie mieści się w przedziale (0, 24)!");
            } else {
                System.out.println("Podana godzina to: " + godzina);
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Do zobaczenia jutro!");
        }

        //zad 2
        try {
            System.out.print("Podaj odległość w metrach: ");
            int distance = scanner.nextInt();

            if (distance > 100) {
                throw new TooFarException();
            }

            System.out.println("Odległość: " + distance + " m");
        } catch (TooFarException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Koniec programu");
        }

        //zad 3
        double liczba = 0;

        while (true) {
            try {
                System.out.print("Podaj liczbę: ");
                liczba = scanner.nextDouble();

                if(liczba < 0) {
                    throw new IllegalArgumentException("Liczba nie może być ujemna!");
                }

                break;
            } catch (InputMismatchException e) {
                System.err.println("Podana wartość nie jest liczbą!");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }

        double pierwiastek = Math.sqrt(liczba);
        System.out.println("Pierwiastek z " + liczba + " wynosi " + pierwiastek);
    }
}