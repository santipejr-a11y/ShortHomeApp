package app.service.validations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FormTypeValidator {


    static Scanner sc = new Scanner(System.in);


    public static int intValidator(String prompt) {
        while (true) {
            System.out.println(prompt);
            String value = sc.nextLine().trim();
            try {
                return Integer.parseInt(value);
            } catch (InputMismatchException e) {
                System.out.println("Solo se adminten numeros enteros" + value + "");
            }
        }
    }

    public static double doubleValidator(String prompt) {
        while (true) {
            System.out.println(prompt);
            String value = sc.nextLine().trim();
            try {

                return Double.parseDouble(value);

            } catch (InputMismatchException e) {
                System.out.println("Solo se adminten numeros decimales" + value + "");
            }
        }
    }

    public static float floatValidator(String prompt) {
        while (true) {

            System.out.println(prompt);
            String value = sc.nextLine().trim();
            try {

                return Float.parseFloat(value);

            } catch (InputMismatchException e) {
                System.out.println("Solo se adminten numeros decimales" + value + "");
            }
        }
    }


    public static String stringValidator(String prompt) {

        while (true) {
            System.out.println(prompt);

            String value = sc.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("El valor no puede estar vacío ");
        }
    }
}
