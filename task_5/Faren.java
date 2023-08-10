package task_5;

public class Faren extends ConverterTemperature{

    @Override
    public void convert(double number) {
        double farangeit = (number * 9/5) + 32;
        System.out.println("Результат в фаренгейтах: " + farangeit);
    }
}
