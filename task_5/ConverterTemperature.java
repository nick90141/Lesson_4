package task_5;

public class ConverterTemperature {
    public void convert (double number){
        double celvin = number + 273.5;
        double farangeit = (number * 9/5) + 32;
        System.out.println("Результат в кельвинах: " + celvin);
        System.out.println("Результат в фаренгейтах: " + farangeit);

    }
}
