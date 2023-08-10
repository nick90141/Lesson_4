package task_5;

public class Kelvin extends ConverterTemperature {
    @Override
    public void convert(double number) {
        double kelvin = number + 273.5;
        System.out.println("Результат в кельвинах: " + kelvin);
    }
}
