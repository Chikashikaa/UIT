package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Бачите перед собою дивовижний калькулятор на одну дію!\n"+
                "Оберіть, що ви хочете зробити зі своїми числами:\n"+
                "   1. Додати\n   2. Відняти\n   3. Помножити\n   4. Поділити");
        Scanner scanner = new Scanner(System.in);
        float choice = scanner.nextFloat();
        if ((choice!=1) && (choice!=2) && (choice!=3) && (choice!=4)){
            System.out.println("У тебе було всього одне завдання: обрати одну з чотирьох цифр. А ти що робиш?\n"+
                    "Я не можу працювати в таких умовах!");
            System.exit(1);
        }
        System.out.println("Супер, тепер введи числа. Розділи їх кнопкою Enter.\n"+
                "Я серйозно, інакше магія не спрацює");
        float first = scanner.nextFloat();
        float second = scanner.nextFloat();

        switch ((int) choice) {
            case  (1):
                System.out.println("Чудовий вибір! Ось результат додавання:" + Add(first, second));
                break;
            case (2):
                System.out.println("Чудовий вибір! Ось результат віднімання:" + Subtract(first, second));
                break;
            case (3):
                System.out.println("Чудовий вибір! Ось результат множення:" + Multiply(first, second));
                break;
            case (4):
                System.out.println("Чудовий вибір! Ось результат ділення:" + Divide(first, second));
                break;
            default:
                System.out.println("Та йой, просили як людину: обери одне з 4 значень. А ти що? Немає слів!");
                break;
        }
    }

    public static float Multiply (float a, float b) {
        float n = a * b;
        return n;
    }

    public static float Divide (float a, float b) {
        float n = a / b;
        return n;
    }

    public static float Subtract (float a, float b) {
        float n = a - b;
        return n;
    }
    public static float Add (float a, float b) {
        float n = a + b;
        return n;
    }

}
