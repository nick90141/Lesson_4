package task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите формат документа - XML/TXT/DOC: ");
        String result = in.nextLine();

        AbstractHandler abstractHandler;

        if ("XML".equalsIgnoreCase(result)) {
            abstractHandler = new XMLHandler();
        } else if ("TXT".equalsIgnoreCase(result)) {
            abstractHandler = new TXTHandler();
        } else if ("DOC".equalsIgnoreCase(result)) {
            abstractHandler = new DOCHandler();
        } else {
            System.out.println("Вы ввели неверный символ!");
            return;
        }
        abstractHandler.open();
        abstractHandler.create();
        abstractHandler.change();
        abstractHandler.save();
    }
}
