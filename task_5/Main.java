package task_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Температура в Кельвинах = Температура в Цельсиях + 273.15
//        °F = (°C × 9/5) + 32 - преобразования температуры из градусов Цельсия (°C) в градусы Фаренгейта (°F)

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество градусов за цельсием: ");
        double number = in.nextDouble();

        ConverterTemperature converterTemperature = new ConverterTemperature ();
        converterTemperature.convert(number);
    }
}
