package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Калькулятор на одну дію\n"+
                "Оберіть дію:\n"+
                "   1. Додати\n   2. Відняти\n   3. Помножити\n   4. Поділити");
        Scanner scanner = new Scanner(System.in);
        float choice = scanner.nextFloat();
        if ((choice!=1) && (choice!=2) && (choice!=3) && (choice!=4)){
            System.out.println("Дія не обрана");
            System.exit(1);
        }
        System.out.println("Введіть числа, розділюючи кнопкою Enter.");
        float first = scanner.nextFloat();
        float second = scanner.nextFloat();

        switch ((int) choice) {
            case  (1):
                System.out.println("Ось результат додавання:" + Add(first, second));
                break;
            case (2):
                System.out.println("Ось результат віднімання:" + Subtract(first, second));
                break;
            case (3):
                System.out.println("Ось результат множення:" + Multiply(first, second));
                break;
            case (4):
                System.out.println("Ось результат ділення:" + Divide(first, second));
                break;
            default:
                System.out.println("Неправильна дія!!!");
                break;
        }
    }
    public static float Add (float a, float b) {
        float n = a + b;
        return n;
    }
    public static float Subtract (float a, float b) {
        float n = a - b;
        return n;
    }
    public static float Divide (float a, float b) {
        float n = a / b;
        return n;
    }
    public static float Multiply (float a, float b) {
        float n = a * b;
        return n;
    }

}
