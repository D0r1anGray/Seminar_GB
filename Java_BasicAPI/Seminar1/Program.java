package Java_BasicAPI.Seminar1;

import java.util.Scanner;

public class Program{
    /**
     * Точка входа - main.
     * Нажав "слэш звёздочка звёздочка Enter", можно создать это поле для документации.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Здарова, брат!");
        printName();
    }

    static void printName(){
        System.out.printf("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.printf("\nПривет, " + str);
    }
    
}
