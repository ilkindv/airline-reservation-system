package util;

import java.util.Scanner;

public class InputUtil {
    private static InputUtil instance;
    private InputUtil(){}

    public static InputUtil getInstance() {
        return instance == null ? instance = new InputUtil() : instance;
    }

    public byte requiredByte (String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextByte();
    }
    public int requiredInt (String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextInt();
    }
    public String requiredString (String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextLine();
    }
    public Double requiredDouble (String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextDouble();
    }
}
