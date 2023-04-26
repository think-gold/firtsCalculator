package org.example;

import java.util.*;

import static org.example.App.divisionError;

/**
 * Hello world!
 */
public class App {

//    Napisz program, który odczytuje od użytkownika dwie liczby oraz znak działania, a następnie oblicza i wyświetla wynik.
//    Program powinien wspierać dodawanie, odejmowanie, mnożenie i dzielenie. Wynik powinien być przedstawiany w formie A + B = C, np 2 + 2 = 4.

    // 1. wyświetlić prośbę o podanie pierwszej liczby
    // 2. Odczytać liczbę wprowadzoną przez użytkownika i zapisać pod zmienną a
    // 3. wyświetlić prośbę o podanie drugiej liczby
    // 4. Odczytać liczbę wprowadzoną przez użytkownika i zapisać pod zmienną b
    // 5. Wyświetlić prośbę o podanie znaku działania
    // 6. Odczytać znak działania od użytkownika i zapisać pod zmienną sign
    // 7. Metoda o nazwie wynik. Przeprowadzić działania w zależności od wprowadzonego znaku (if else, switch). Sprawdzić czy przy dzieleniu nie dzielimy przez 0
    // 7.1 Jeżeli znak wprowadzony to +; return a+b
    // 7.2 Jeżeli znak wprowadzony to -; return a-b
    // 7.3 Jeżeli znak wprowadzony to *; return a*b
    // 7.4 Jeżeli znak wprowadzony to /; return a/b
    // 8. Wyswietlić wynik za pomącą instrukcji if else:
    // 8.1 Jeżeli sign == + -> wyswietl "Wynik dodawania: " + a + sign + b + "=" + *wynik

    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        float numberA = getUserNumber();
        float numberB = getUserNumber();
        String sign = getUserSign();
        while (sign.equals("/") && numberB == 0) {
            divisionError();
            numberB = getUserNumber();
        }
        float result = calculation(sign, numberA, numberB);
        displayResult(numberA, numberB, sign, result);
    }

    static Scanner scanner = new Scanner(System.in);

    public static float getUserNumber() {
        System.out.print("Please enter number: ");
        float number = Float.parseFloat(scanner.nextLine());
        return number;
    }

    public static String getUserSign() {
        System.out.print("Please enter sign: ");
        String sign = scanner.nextLine();
        return sign;
    }

    public static void divisionError() {   // w jaki sposob mozemy wplywac na parametry przeslane do metody?
        System.out.println("Nie można dzielić przez 0!!!");
        System.out.println("Wprowadź liczbę różną od zera");
    }

    public static float calculation(String sign, float a, float b) {
        if (sign.equals("+")) {
            return a + b;
        } else if (sign.equals("-")) {
            return a - b;
        } else if (sign.equals("*")) {
            return a * b;
        } else {
            return a / b;
        }
    }

    public static void displayResult(float a, float b, String sign, float result) {
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}
